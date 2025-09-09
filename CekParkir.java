// package parkiroi

import java.util.Scanner;

public class CekParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parkir parkir = new Parkir();

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = scanner.nextInt();

        for (int hari = 1; hari <= jumlahHari; hari++) {
            System.out.println("\nHari ke-" + hari);
            System.out.print("Masukkan jenis kendaraan (1.mobil, 2.motor): ");
            int jenis = scanner.nextInt();

            parkir.tambahParkir(jenis, hari);
        }

        System.out.println("\nTotal biaya parkir: Rp " + parkir.getTotalBayar());

        scanner.close();
    }
}
