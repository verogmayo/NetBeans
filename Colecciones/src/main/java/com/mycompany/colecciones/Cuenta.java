/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colecciones;

import java.util.Objects;

/**
 *
 * @author veronique.gru
 */
public class Cuenta implements Comparable<Cuenta>{
    private String codigo;
    private String titular;
    private float saldo;

    public Cuenta() {
    }

    public Cuenta(String codigo, String titular, Float saldo) {
        this.codigo = codigo;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitular() {
        return titular;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.titular, other.titular)) {
            return false;
        }
        return Objects.equals(this.saldo, other.saldo);
    }

    
    @Override
    public String toString() {
        return "Cuenta{" + "codigo=" + codigo + ", titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    @Override
    public int compareTo(Cuenta o) {
      return this.codigo.compareTo(o.codigo);
    }
    
}
