import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();

        System.out.print("Masukan angka pertama : ");
        int a = scanner.nextInt();

        System.out.print("Masukan angka kedua : ");
        int b = scanner.nextInt();

        System.out.println("Pilih Operasi : ");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");

        int operasi = scanner.nextInt();
        int hasil;

        switch (operasi) {
            case 1:
                hasil = kal.tambah(a, b);
                System.out.println(a + " + " + b + " = " + hasil);
                break;
            case 2:
                hasil = kal.kurang(a, b);
                System.out.println(a + " - " + b + " = " + hasil);
                break;
            case 3:
                hasil = kal.kali(a, b);
                System.out.println(a + " * " + b + " = " + hasil);
                break;
            case 4:
                hasil = kal.bagi(a, b);
                System.out.println(a + " / " + b + " = " + hasil);
                
                break;
            default:
                System.out.println("Pilih Operasi yg bener tod");
                break;
        }

        scanner.close();
    }
}
