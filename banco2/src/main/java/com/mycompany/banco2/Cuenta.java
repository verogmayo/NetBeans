/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco2;

import java.util.Objects;

/**
 *La clase (@code Cuenta) modela una cuenta bancaria
 * @author veronique.gru
 * @since 1.0
 */
public class Cuenta {
    
    private String codigo;
    
    private String titular;
    
    private float saldo;
    /**
     * Permite instanciar un objeto 
     * @param codigo el codigo de de la cuenta
     * @param titular el DNI del titular de la cuenta
     * @param saldo  el saldo de la cuenta.
     * Hay que fijarse como lo hace en la api
     */

    public Cuenta(String codigo, String titular, float saldo) {
        this.codigo = codigo;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    

    /**
     * Get the value of saldo
     *
     * @return the value of saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * Set the value of saldo
     *
     * @param saldo new value of saldo
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public void ingresar(float cantidad) {
        if(cantidad>0){
            saldo+=cantidad; /*los atributos tienen otro color, y si se toca CTRL y se pone el ratón encima, lleva al enlace en el que se declaró la clase*/
        }
    }
    public void reintegrar(float cantidad) {
        if(cantidad>0 && cantidad<=saldo) {
            saldo-=cantidad;
        }
    }


    /**
     * Get the value of titular
     *
     * @return the value of titular
     */
    public String getTitular() {
        return titular;
    }

    /**
     * Set the value of titular
     *
     * @param titular new value of titular
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }


    /**
     * Get the value of codigo
     *
     * @return the value of codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Set the value of codigo
     *
     * @param codigo new value of codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return   codigo + "," + titular + ", " + saldo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cuenta other = (Cuenta) obj;
        return Objects.equals(this.codigo, other.codigo);
    }
    
    

}
