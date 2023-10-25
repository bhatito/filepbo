package pertemuan4;

public class subClass extends superClass{
    int usia;

    public subClass(String nama, String keterangan, int usia) {
        super(nama, keterangan);
        this.usia = usia;
    }

    public int getUsia() {
        return usia;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getKeterangan() {
        return super.getKeterangan();
    }
}
