package com.pss.validator;

import com.pss.annotation.ValidateReferenceDataCode;
import com.pss.service.ReferenceDataAggregatorService;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
public class ReferenceDataCodeValidator implements ConstraintValidator<ValidateReferenceDataCode, String[]>{

    private final ReferenceDataAggregatorService referenceDataAggregator;
    @Override
    public boolean isValid(String[] codes, ConstraintValidatorContext constraintValidatorContext) {
        for (String code : codes) {
            if(! referenceDataAggregator.getCodes().contains(code)){
                setConstraintValidationMessage("Invalid reference data code :"+code, constraintValidatorContext);
                return false;
            }
        }
        return true;
    }


    private void setConstraintValidationMessage(String message, ConstraintValidatorContext constraintValidatorContext){
        constraintValidatorContext.disableDefaultConstraintViolation();
        constraintValidatorContext
                .buildConstraintViolationWithTemplate(message)
                .addConstraintViolation();
    }
}
