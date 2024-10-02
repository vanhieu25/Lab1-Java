import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai hinh chu nhat: ");
        int dai = sc.nextInt();
        System.out.println("Nhap vao chieu rong hinh chu nhat: ");
        int rong =  sc.nextInt();
        int chuvi = (dai + rong)*2;
        System.out.println("Chu vi hinh chu nhat la: " + chuvi);
        int dientich = dai * rong;
        System.out.println("Dien tich hinh chu nhat la: "+ dientich);
        System.out.println("Canh nho nhat cua hinh chu nhat la: "+ Math.min(dai,rong));
    }
}
