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
public class Ex3 {
    public static void main(String[] args) {
        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so a:");
        int a = input.nextInt();
        int i = 1;
        while (i <= a) {
            sum += i;
            i++;
        }
        System.out.println( "Sum:" + sum);
    }
}
