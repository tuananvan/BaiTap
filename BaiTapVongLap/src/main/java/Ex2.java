/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Ex2 {
    public static void main(String[] args) {
        for (int i=5;i>=1; i--){
            int d=i;
            for(int j=1;j<=d;){
              System.out.print(d);
              d--;
            }
            System.out.println(" ");
        }
    }
}
