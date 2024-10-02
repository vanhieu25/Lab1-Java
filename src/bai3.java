import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao do dai canh cua khoi lap phuong: ");
        int canh =sc.nextInt();
        double thetich = Math.pow(canh,3);
        System.out.println("The tich cua khoi lap phuong la: "+ thetich);
    }
}
