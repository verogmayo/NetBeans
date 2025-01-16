/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenes;

/**
 *
 * @author Usuario
 */
public class NumeroComplejo2 {
    private float parteReal;
    private float parteImaginaria;

    public NumeroComplejo2() {
    }

    public NumeroComplejo2(float parteReal, float parteImaginaria) {
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
    
    public NumeroComplejo2 sumar(NumeroComplejo2 z){
        return new NumeroComplejo2(this.parteReal+z.parteReal,this.parteImaginaria+z.parteImaginaria) ;
    }
    public NumeroComplejo2 restar(NumeroComplejo2 z){
        return new NumeroComplejo2(this.parteReal-z.parteReal,this.parteImaginaria-z.parteImaginaria) ;
    }
    public NumeroComplejo2 multiplicar(NumeroComplejo2 z){
        return new NumeroComplejo2((this.parteReal*z.parteReal)-(this.parteImaginaria*z.parteImaginaria),(this.parteReal*z.parteImaginaria)+(this.parteImaginaria*z.parteReal)) ;
    }
    public NumeroComplejo2 conjugado(){
        return new NumeroComplejo2(parteReal,-parteImaginaria) ;
    }

    @Override
    public String toString() {
        return "(" + parteReal+ ","+parteImaginaria + ")";
    }
    public NumeroComplejo2 sumar(NumeroComplejo2 z1,NumeroComplejo2 z2){
        return new NumeroComplejo2(z1.parteReal+z2.parteReal,z1.parteImaginaria+z2.parteImaginaria) ;
    }
    public String printFormatBinomica() {
        if(parteImaginaria>0){
        return  parteReal+ "+"+parteImaginaria + "i";
        }else{
        return  parteReal+ ""+parteImaginaria + "i";
        }
        
    }
}
