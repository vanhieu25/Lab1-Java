import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten sinh vien: ");
        String ten = sc.nextLine();
        System.out.println("Nhap vao so diem cua sinh vien: ");
        double diem = sc.nextInt();
        System.out.println("Ten sinh vien la: "+ ten + " co so diem la: "+ diem);

    }
}
