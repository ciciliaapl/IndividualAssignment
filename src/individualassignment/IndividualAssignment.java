/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package individualassignment;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class IndividualAssignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("Individual Assignment 1 \n");
       System.out.print("Cicilia Marindi Putri \n");
       System.out.print("Masukkan massa dalam kilogram : ");
            Scanner input = new Scanner(System.in); 
            double kg = input.nextDouble();
            double ton = kg/1000;
            double kuintal = kg/100;
            double g = kg*1000;
            double mg = g*1000;
            double pon = kg*2;
            double ons = kg*10;
            System.out.println(kg + " kilogram sama dengan : \n" + ton + " ton\n" + kuintal + " kuintal\n" + g + " g\n" + mg + " mg\n" + pon + " pon\n" + ons + " ons\n");
        System.out.println("Sumber : https://javaasyik.wordpress.com/2013/06/19/aplikasi-full-konversi/");
    }
    
}
