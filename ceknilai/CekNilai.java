import java.util.Scanner;

public class CekNilai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nilai nil = new Nilai();

        System.out.print("Masukan Nilai : ");
        int a = scanner.nextInt();
        nil.CekNilai(a);

        scanner.close();
    }
}
