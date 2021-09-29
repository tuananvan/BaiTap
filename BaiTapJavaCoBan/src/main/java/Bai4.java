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
public class Bai4 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Nhap a:");
        Scanner input  = new Scanner(System.in);
        a = input.nextInt();
        b = a % 7;
           switch (b) {
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
      case 0:
        System.out.println("Sunday");
        break;
           }
    }
}