package ar.com.educacionit.clase3.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import ar.com.educacionit.clase3.service.UniqueEmailValidator;

@Constraint(validatedBy = UniqueEmailValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface UniqueEmail {
	String message() default "El email ya está en uso";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
