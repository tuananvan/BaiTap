import java.util.Scanner;
public class PhuongTrinhBacNhat {
    public static void main (String[] args) {
        int a,b;
        double x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a");
        a = scanner.nextInt();
        System.out.println("Nhap b");
        b = scanner.nextInt();
        if (a == 0){
            if (b == 0){
                System.out.println("Phuong trinh vo so nghiem.");
            } 
            else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        } 
        else {
            x = (double) -b/a;
            System.out.println("Phuong trinh co duy nhat nghiem x:" + x);
        }
    }
}