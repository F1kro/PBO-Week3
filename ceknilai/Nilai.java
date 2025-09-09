public class Nilai {

    public void CekNilai(int nilai) {
        if (nilai >= 85) {
            System.out.println("Lulus");
            System.out.println("Grade A");
        } else if (nilai >= 70 && nilai <= 84) {
            System.out.println("lulus");
            System.out.println("Grade B");
        } else if (nilai >= 60 && nilai <= 69) {
            System.out.println("lulus");
            System.out.println("Grade C");
        } else if (nilai >= 50 && nilai <= 59) {
            System.out.println("tidak lulus");
            System.out.println("Grade D");
        } else if (nilai <= 49) {
            System.out.println("tidak lulus");
            System.out.println("Grade E");
        } else {
            System.out.println("masukin nilai yang logis bodo !");
        }
    }
}
