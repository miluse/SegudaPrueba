/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miguel
 */
public class Principal {
    public static void main(String[]args){
        Perro miPrimerPerro = new Perro("Amador", "Caniche Toy");
        
        System.out.println("Tengo un perro llamado " + miPrimerPerro.getNombre());
        System.out.println("Su raza es : " + miPrimerPerro.getRaza());
        System.out.println("¿Esta vivo? " + miPrimerPerro.getVida());
    
        Perro segundoPerro = new Perro("Flafly", "Fox Ter.");
        segundoPerro.setVida(false);
        
        System.out.println("Mi otro perro se llama " + segundoPerro.getNombre());
        System.out.println("Su raza es " + segundoPerro.getNombre());
        System.out.println("¿Esta vivo?" + segundoPerro.getVida());
    
    }
    
}
