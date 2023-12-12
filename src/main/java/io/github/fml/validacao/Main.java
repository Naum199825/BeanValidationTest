/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.fml.validacao;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 *
 * @author Friedrich
 */
public class Main {
    public static void main(String[] args) {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        QuadradoP objeto = new QuadradoP();
        objeto.setNumero(9);

        // Realiza a validação
        var violations = validator.validate(objeto);

        // Exibe as mensagens de erro, se houverem
        violations.forEach(violation -> System.out.println(violation.getMessage()));
    }

}
