package app.prueba.ada.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

	@Id
	@Column(name = "company_id")
	private Long companyId;
	
	@Column(name = "codigo_company", unique = true)
	private String codigoCompany;
	
	@Column(name = "name_company")
	private String nameCompany;
	
	@Column(name = "description_company")
	private String descriptionCompany;
	
	public Company() {
	}

	public Company(Long companyId, String codigoCompany, String nameCompany, String descriptionCompany) {
		this.companyId = companyId;
		this.codigoCompany = codigoCompany;
		this.nameCompany = nameCompany;
		this.descriptionCompany = descriptionCompany;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getCodigoCompany() {
		return codigoCompany;
	}

	public void setCodigoCompany(String codigoCompany) {
		this.codigoCompany = codigoCompany;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getDescriptionCompany() {
		return descriptionCompany;
	}

	public void setDescriptionCompany(String descriptionCompany) {
		this.descriptionCompany = descriptionCompany;
	}
	
	
	
}
