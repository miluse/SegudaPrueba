/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Perro {
   private String nombre;
   private String raza;
   private boolean vida;
   private String color;
   
   public Perro(String nombre, String raza){ //Constructor. Con esto vamos a construir un perro con un nombre y una raza-
       this.nombre = nombre;
       this.raza = raza;
       this.vida = true;
   }

    public Perro(String nombre) {
        this.nombre = nombre;
    }
   
   public String getNombre(){
       return this.nombre;
   }
   public void setNombre(String nuevoNombre){ // para cambiar el nombre 
       this.nombre = nuevoNombre;
   }
   public String getRaza(){
       return this.raza;
   }
   public void setRaza(String nuevaRaza){
       this.raza = nuevaRaza;
   }
   public boolean getVida(){
       return this.vida;
   }
   public void setVida(boolean nuevaVida){
       this.vida = nuevaVida;
   }
}




