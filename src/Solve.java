import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Moi nhap so tien cho vay:");
        int loan =scanner.nextInt();
        System.out.println("Moi nhap  lai suat hang thang :");
        float interestRate = scanner.nextFloat();
        System.out.println("Moi nhap so thang cho vay:");
        int month = scanner.nextInt();

        double tienLai = loan*(interestRate/12)*month;

        System.out.println("Tổng số tiền lãi bạn nhận được sau khi cho vay là: "+tienLai);
    }
}
