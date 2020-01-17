/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github;

import java.util.Scanner;

/**
 *
 * @author Javi
 */
public class GitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Dame un número");
        int numero=teclado.nextInt();
        
        for (int i = 0; i < numero; i++) {
            System.out.println(numero*i);
        }
    }
    
}
