/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenes;

/**
 *
 * @author Usuario
 */
public class Fraccion {

    private int numerador=1;
    private int denominador=1;

    public Fraccion() {
        
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccion sumar(Fraccion otraFraccion){
        return new Fraccion((this.numerador*otraFraccion.denominador+this.denominador*otraFraccion.numerador),(this.denominador*otraFraccion.denominador));
    }
    
    public Fraccion multiplicar(Fraccion otraFraccion){
        return new Fraccion(this.numerador*otraFraccion.numerador,this.denominador*otraFraccion.denominador);
    }

    @Override
    public String toString() {
        return numerador+"/"+denominador;
    }
    
    
    
}