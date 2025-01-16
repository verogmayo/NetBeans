/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenes;

/**
 *
 * @author Usuario
 */
public class NumeroComplejo {
    private float parteReal;
    private float parteImaginaria;

    public NumeroComplejo() {
    }

    public NumeroComplejo(float parteReal, float parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }

    public float getParteReal() {
        return parteReal;
    }

    public float getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteReal(float parteReal) {
        this.parteReal = parteReal;
    }

    public void setParteImaginaria(float parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
    
    public NumeroComplejo sumar(NumeroComplejo z){
        return new NumeroComplejo(this.parteReal+z.parteReal,this.parteImaginaria+z.parteImaginaria);
    }
    public NumeroComplejo restar(NumeroComplejo z){
        return new NumeroComplejo(this.parteReal-z.parteReal,this.parteImaginaria-z.parteImaginaria);
    }
    public NumeroComplejo multiplicar(NumeroComplejo z){
        return new NumeroComplejo((this.parteReal*z.parteReal)-(this.parteImaginaria*z.parteImaginaria),(this.parteReal*z.parteImaginaria)+(this.parteImaginaria*z.parteReal));
    }
    public NumeroComplejo conjugado(){
        return new NumeroComplejo(this.parteReal,-this.parteImaginaria);
    }

    @Override
    public String toString() {
        return "(" + parteReal + " , " + parteImaginaria + ")";
    }
    public String printFormaBinomica() {
        return parteReal + " + " + parteImaginaria;
    }
}