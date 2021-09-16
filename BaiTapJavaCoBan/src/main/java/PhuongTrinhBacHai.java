import java.util.Scanner;
public class PhuongTrinhBacHai {
    public static void main(String[] args) {
    int a,b,c;
    double delta,x, x1, x2;
    System.out.println("Nhap a");
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    System.out.println("Nhap b");
    b = input.nextInt();
    System.out.println("Nhap c");
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