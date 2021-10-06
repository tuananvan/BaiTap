/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Ex7 {
    public static void main(String[] args) {
        int count = 10, num1 = 0, num2 = 1;
        System.out.print("Chuoi Fibonacci voi "+count+" so la: ");
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        System.out.println();
    }
}

