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
public class Ex9 {
    public static void main(String[] args) {
        int num, reversed = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so: ");
        num = scanner.nextInt();
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("So dao nguoc: " + reversed);
    }
}