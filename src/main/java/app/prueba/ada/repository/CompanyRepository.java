package app.prueba.ada.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.prueba.ada.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long>{

	public Optional<Company> findByCodigoCompany(String codigoCompany);
}
