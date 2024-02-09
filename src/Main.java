import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,select;
        double sonuc ;

        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz: ");
        n1 = scanner.nextInt();
        System.out.println("ikinci sayıyı giriniz: ");
        n2 = scanner.nextInt();

        System.out.println("1 - Toplama \n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        select = scanner.nextInt();

        switch (select){
            case 1:
                sonuc = n1+n2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = n1-n2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = n1 * n2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc = n1 /n2;
                System.out.println(sonuc);
                break;
            default:

                System.out.println("geçersiz sayı");
        }


    }
}