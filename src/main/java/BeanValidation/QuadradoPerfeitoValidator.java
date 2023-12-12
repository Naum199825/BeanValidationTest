/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Bean_Validation/Validator.java to edit this template
 */
package BeanValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author fried
 */
public class QuadradoPerfeitoValidator implements ConstraintValidator<QuadradoPerfeito, Integer> {
    
    @Override
    public void initialize(QuadradoPerfeito constraintAnnotation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        if(value==null){
            return false;
        }
        double raizQuadrada = Math.sqrt(value);
        return raizQuadrada - Math.floor(raizQuadrada)== 0;
    }
}
