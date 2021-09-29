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
public class Bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so:");
        int number=scanner.nextInt(10);
        if (number < 0){
            System.out.println("That number is negative");
        }
        else if (number > 0){
            System.out.println("That number is positive");
        }
        else {
            System.out.println("Number is neither negative nor positive");
        }
    }
}
