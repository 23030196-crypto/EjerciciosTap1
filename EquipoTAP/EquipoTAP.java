/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equipotap;

import java.util.Scanner;

/**
 *
 * @author gugul
 */
public class EquipoTAP {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cant = 0;
        double rango, mayor, menor;
        
        System.out.println("Ingresa el numero de datos");
        cant = sc.nextInt();
          
        Bubble b = new Bubble ()
        double arreglo [] = new double[cant];
        
        for (int i = 0; i < cant; i++){
            System.out.println("Ingresa un valor");
            arreglo [i] = sc.nextDouble();
        } 
        
        
        rango = arreglo[0] - arreglo [cant -1];
        System.out.println("Rango = " + rango);
    }
    
    
}

class Bubble{
    double a[];
    double t;
    
    Bubble (double a[]){
        this.a = a;
        ordenar();
    }
    
    public void ordenar(){
        for (int i = 0; i<a.length; i++){
            for (int j = 0; j<a.length-i-1; j++){
                if(a[j]> a[j+1]){
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }
}