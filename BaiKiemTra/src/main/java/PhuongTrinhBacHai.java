/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class PhuongTrinhBacHai {
    public static void main(String[] args) {
    int a,b,c;
    double delta, x1, x2, x;
    System.out.println("nhap a");
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    System.out.println("Nhap b");
    b = input.nextInt();
    System.out.println("nhap c");
    c = input.nextInt();
    delta = ((b*b)-4*a*c);
    if (delta > 0){
        x1 =((-b + Math.sqrt(delta)) / (2*a));
        x2 =((-b - Math.sqrt(delta)) / (2*a));
        System.out.println("Phuong trinh co hai nghiem la: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        }
    else if (delta == 0){
        x = (-b / (2 * a));
            System.out.println("Phuong trinh co nghiem kep: "
                    + "x = " + x);
        }
    else {
        System.out.println("Phuong trinh vo nghiem");
    }
    
    }
  }