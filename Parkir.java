// package parkiroi

public class Parkir {
    public int mobil = 5000;
    public int motor = 2000;
    private int totalBayar = 0;

    public void tambahParkir(int jenis, int hari) {
        if (jenis == 1) {
            totalBayar += hari * mobil;
        } else if (jenis == 2) {
            totalBayar += hari * motor;
        } else {
            System.out.println("Jenis kendaraan tidak valid: " + jenis);
        }
    }

    public int getTotalBayar() {
        return totalBayar;
    }
}
