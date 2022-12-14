package com.Udea.Ciclo3;

import com.Udea.Ciclo3.modelos.Empresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityFilterAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication (exclude = {SecurityAutoConfiguration.class})
@RestController
public class Ciclo3Application {

	@GetMapping("/hello")
	public String hello(){
		return "Primera prueba";
	}

	@GetMapping("/test")
	public String test(){
		Empresa emp1 = new Empresa("Empresa 1", "Cra 70","3107002721","80021345");
		emp1.setNombre("NUEVO NOMBRE");
		return (emp1.getNombre() + emp1.getDireccion() + emp1.getNIT() + emp1.getId());
	}

	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
