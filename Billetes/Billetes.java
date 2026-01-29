/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billetes;

import java.util.Scanner;

/**
 *
 * @author gugul
 */
public class Billetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cien;
        float cincv;
        float veint;
        float diez;
        float cinco;git.
        float cincc;
        float peso;
        Scanner sc = new Scanner (System.in);
        float cantidad = sc.nextFloat();
        
        
        cien =(cantidad/100);
        String temp = cien.toString();
        int icien = Integer.parseInt(cien);
        cantidad-= icien*100;
        
    }
    
    
}
