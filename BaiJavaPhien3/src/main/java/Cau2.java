/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
import java.util.Scanner;
public class Cau2 {
     public static void main(String[] args){
     double i,m;
     Scanner input= new Scanner(System.in);
     System.out.println("Enter a value for inch");
     i =input.nextDouble();
     m= i/39.37;
     System.out.println("Value in meter is:%3f\n" + m);
    }
}
