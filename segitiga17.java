import java.util.Scanner;

public class segitiga17 {
    public static void main(String[] args) {
        Scanner luas = new Scanner(System.in);
        int alas, tinggi;
        float hasil;

        System.out.print("Masukkan tinggi: ");
        tinggi = luas.nextInt();
        System.out.print("Masukkan alas: ");
        alas = luas.nextInt();

        hasil = alas * tinggi / 2;
        System.out.println("Luas segitiga adalah " + hasil);
    }
}