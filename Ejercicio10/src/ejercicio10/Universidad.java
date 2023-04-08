/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio10;

public class Universidad {
    public static double calcularMatricula(double p, double e){
        double valor;
        
        if(p>2000000 && e>3){
            valor = 50000 + p*0.03;
        }
        else{
            valor = 50000;
        }
        
        return valor;
    }
}
