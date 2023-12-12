/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package io.github.fml.validacao;

import BeanValidation.QuadradoPerfeito;

/**
 *
 * @author fried
 */
public class QuadradoP {
    
    @QuadradoPerfeito
    private Integer Numero;

    
//<editor-fold defaultstate="collapsed" desc="Constructos">
        public QuadradoP() {
    }

    public QuadradoP(Integer Numero) {
        this.Numero = Numero;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
        public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }
    
//</editor-fold>

    
}
