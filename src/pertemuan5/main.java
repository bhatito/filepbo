package pertemuan5;

public class main {
    public static void main(String[] args) {
        Hewan hewan1 = new Anjing();
        Hewan hewan2 = new Kucing();

        hewan1.suara(); // Output: Anjing menggonggong...
        hewan2.suara(); // Output: Kucing miau...
    }
}
