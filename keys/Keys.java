/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keys;

import java.util.Scanner;

/**
 *
 * @author gugul
 */
public class Keys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int a = 270 ,b= 340 ,c=390, precio=0;
        String prod;
        System.out.println("Cual producto eliges?"
                + "a. Producto precio 270"
                + "b. Producto precio 340"
                + "c. Producto precio ");
        prod = sc.nextLine();
        switch (prod){
            case "a":
                precio = a;
                break;
            case "b":
                precio = b;
                break;  
            case "c":
                precio = c;
                break;    
        }
        
        
        int cambio = 0, pago=0;
        while(pago > precio){
            System.out.println("Ingresa las monedas a pagar"
                + "100"
                + "50"
                + "10");
            pago += sc.nextInt();
        
        }
        
        int cien,cinco,diez;
        
        cien = precio/100;
        precio -= cien;
        
        
    }
    
    
}
