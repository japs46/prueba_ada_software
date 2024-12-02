package app.prueba.ada.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.prueba.ada.model.Company;
import app.prueba.ada.services.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyControllers {
	
	@Autowired
	private CompanyService companyService;

	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<?> eliminarCompany(@PathVariable Long id){
		
		try {
			companyService.eliminar(id);
			return ResponseEntity.ok("Se elimino la company");
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("No se pudo eliminar la company");
		}
		
	}
	
	@GetMapping("/buscarPorId/{id}")
	public ResponseEntity<?> buscarCompanyPorId(@PathVariable Long id){
		try {
			return ResponseEntity.ok(companyService.buscarPorId(id));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("No se pudo encontrar la company");
		}
	}
	
	@GetMapping("/buscarTodo")
	public ResponseEntity<?> buscarTodasLasCompany(){
		try {
			return ResponseEntity.ok(companyService.buscarTodos());
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("No se pudo listar las company");
		}
	}
	
	@GetMapping("/buscarPorCodigo/{codigo}")
	public ResponseEntity<?> buscarCompanyPorCodigo(@PathVariable String codigo){
		System.err.println("Prueba: "+ codigo);
		try {
			return ResponseEntity.ok(companyService.buscarPorCodigo(codigo));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("No se pudo encontrar la company");
		}
	}
	
	@PostMapping("/guardar")
	public ResponseEntity<?> guardarCompany(@RequestBody Company company){
		try {
			return ResponseEntity.ok(companyService.guardar(company));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("No se pudo guardar la company");
		}
	}
	
	@PutMapping("/actualizar/{idCompany}")
	public ResponseEntity<?> actualizarCompany(Long idCompany,@RequestBody Company company){
		try {
			return ResponseEntity.ok(companyService.actualizar(idCompany,company));
		} catch (Exception e) {
			return ResponseEntity.internalServerError().body("No se pudo guardar la company");
		}
	}
	
}
