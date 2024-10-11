package ar.com.educacionit.clase3.service;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.educacionit.clase3.repository.ClienteRepository;
import ar.com.educacionit.clase3.validator.UniqueEmail;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueEmailValidator implements ConstraintValidator<UniqueEmail, String> {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		if (email == null) {
			return true;
		}
		return !clienteRepository.existsByEmail(email);
	}
	

}
