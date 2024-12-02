package app.prueba.ada.services;

import java.util.List;

import org.springframework.stereotype.Service;

import app.prueba.ada.model.Company;
import app.prueba.ada.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService{
	
	private final CompanyRepository companyRepository;
	
	public CompanyServiceImpl(CompanyRepository companyRepository) {
		this.companyRepository = companyRepository;
	}

	@Override
	public void eliminar(Long id) {
		companyRepository.deleteById(id);
	}

	@Override
	public Company buscarPorId(Long id) {
		return companyRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Company> buscarTodos() {
		return companyRepository.findAll();
	}

	@Override
	public Company guardar(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public Company buscarPorCodigo(String codigo) {
		return companyRepository.findByCodigoCompany(codigo).orElseThrow();
	}

	@Override
	public Company actualizar(Long idCompany, Company company) {
		
		Company companyBd= companyRepository.findById(idCompany).orElseThrow();
		
		if (company == null) {
			throw new RuntimeException("cuerpo es null");
		}
		
		companyBd.setCodigoCompany(company.getCodigoCompany());
		companyBd.setDescriptionCompany(company.getDescriptionCompany());
		companyBd.setNameCompany(company.getNameCompany());
		
		return companyRepository.save(companyBd);
	}

}
