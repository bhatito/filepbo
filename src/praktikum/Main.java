package praktikum;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan jari-jari kerucut: ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi kerucut: ");
        double tinggiKerucut = input.nextDouble();

        Segitiga segitiga = new Segitiga(alas, tinggi);
        Kerucut kerucut = new Kerucut(alas, tinggi, jariJari, tinggiKerucut);

        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
        System.out.println("Volume Kerucut: " + kerucut.hitungVolume());

        input.close();
    }
}
