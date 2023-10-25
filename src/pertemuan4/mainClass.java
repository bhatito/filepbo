package pertemuan4;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainClass {

    public static  void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        subClass s = new subClass("", "", 0);

        System.out.println("--INPUT--");
        System.out.println("Masukan Nama : ");
        String nama = br.readLine();
        System.out.println("Masukan Keterangan : ");
        String keterangan = br.readLine();
        System.out.println("Masukan Usia : ");
        int usia = Integer.parseInt(br.readLine());

        s =new subClass(nama,keterangan,usia);


        System.out.println("--OUTPUT--");
        System.out.println("Nama: " + s.getNama());
        System.out.println("Keterangan: " + s.getKeterangan());
        System.out.println("Usia: " + s.getUsia());
    }
}
