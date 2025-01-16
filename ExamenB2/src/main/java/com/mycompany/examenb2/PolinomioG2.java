/*
 * Hola Mundo
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examenb2;

/**
 *
 * @author veronique.gru
 */
public class PolinomioG2 {
    private float a;
    private float b;
    private float c;

    public PolinomioG2(float a, float b, float c) {
        if (a==0){
           this.a=1;
        }else{
         this.a = a;
        }
       
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public void setA(float a) {
        this.a = a;
    }

    public void setB(float b) {
        this.b = b;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public float evaluar(float x){
        return (a*(x*x)+b*x+c);
    }
     private float getDiscriminante(){
      return ((b*b)-(4*a*c));
     }
     
     public String getRaices(){
         float x1,x2, parteReal, parteImaginaria;
         if( this.getDiscriminante()<0){
             parteReal=-b/2*a;
             parteImaginaria=(float)((Math.sqrt(Math.abs(this.getDiscriminante())))/2*a);
             String complejo1=parteReal+"+"+parteImaginaria+"i";
             String complejo2=parteReal+"-"+parteImaginaria+"i";
             return "["+complejo1+","+complejo2+"]";
         
         }else {
         x1=(float)((-b+(Math.sqrt(PolinomioG2.this.getDiscriminante())))/2*a);
         x2=(float)((-b-(Math.sqrt(PolinomioG2.this.getDiscriminante())))/2*a);
          return  ("["+x1+","+x2+"]");
         }
         
                 
        
     }

    @Override
    public String toString() {
        if(a==1||b==1){
         return "x^2+x+"+c;
        }if((a==-1)||(b==-1)){
            return "-x^2-x"+c;
            }else{ 
            return a+"x^2+"+b+"x+"+c;
        }
    }
}
    

