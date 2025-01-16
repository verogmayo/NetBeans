/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenes;

/**
 *
 * @author veronique.gru
 */
public class Vector2D {
    private float x;
    private float y;

    public Vector2D() {
    }

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
    public float getMagnitud(){
        float magnitud=(float)Math.sqrt((x*x)+(y*y));
        return magnitud;
    }
    public Vector2D normalizar(){
        if (this.getMagnitud()==0){
            return null;
        }else {
         float x1=this.x/this.getMagnitud();
        float x2=this.y/this.getMagnitud();
        return new Vector2D(x1,x2);
        } 
    }
    public float getProductoEscalar(Vector2D v){
       float escalar=(this.x*v.x)+(this.y*v.y);
        return escalar;
    }
    public boolean esPerpandicular(Vector2D v){
        if (this.getProductoEscalar(v)==0){ //return this.getProductoEscalar(v)=0;
            return true;
        }else {
            return false;
        }
    }
    
    public String printFormaPolar(){
        float angulo=(float)Math.atan2(this.y, this.x);
       float anguloGrados=(float)Math.toDegrees(angulo);
        return "("+this.getMagnitud()+","+anguloGrados+"º)";    }
}
