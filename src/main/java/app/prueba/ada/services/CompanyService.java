package app.prueba.ada.services;

import java.util.List;

import app.prueba.ada.model.Company;

public interface CompanyService {

	public void eliminar(Long id);
	
	public Company buscarPorId(Long id);
	
	public List<Company> buscarTodos();
	
	public Company guardar(Company company);
	
	public Company buscarPorCodigo(String codigo);
	
	public Company actualizar(Long idCompany, Company company);
}
