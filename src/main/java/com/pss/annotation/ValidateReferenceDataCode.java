package com.pss.annotation;





import com.pss.validator.ReferenceDataCodeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = ReferenceDataCodeValidator.class)
public @interface ValidateReferenceDataCode {
    String message() default "Invalid code for reference data API";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
