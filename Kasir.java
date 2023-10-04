import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        
        Scanner Sc = new Scanner(System.in);
    
        System.out.println("Kasir Toko Bismillah");
        System.out.println("==========================");
        System.out.println("List Barang Toko Bismillah : ");
        System.out.println("Roti \t\t: 20000");
        System.out.println("Beras \t\t: 50000");
        System.out.println("Telur 1 kg \t: 15000");
        System.out.println("Minyak \t\t: 25000");
        System.out.println("Gula \t\t: 12000");
        System.out.println("Snack \t\t: 8000");
        System.out.println("Mie Instan\t: 4000");
        System.out.println("Rokok \t\t: 25000");
        System.out.println("==========================");

        // INPUT

        System.out.print("Masukkan Nama Barang \t: "); // INPUT NAMA BARANG
        String namaBarang = Sc.nextLine();

        System.out.print("Masukkan Harga Barang \t:"); // INPUT HARGA BARANG
        double hargaBarang = Sc.nextDouble();
        
        System.out.print("Masukkan Jumlah Barang \t: "); // INPUT JUMLAH BARANG
        int jumlahBarang = Sc.nextInt();

        double totalHarga = jumlahBarang * hargaBarang; // OPERASI JUMLAH BARANG DIKALI HARGA BARANG
        System.out.println("");
        System.out.println("Harga Total : " + totalHarga); // OUTPUT HARGA TOTAL
        System.out.println("==========================");
        System.out.print("Masukkan Cash Pembeli : "); // INPUT CASH PEMBELI
        double Cash = Sc.nextDouble();

        if (Cash > hargaBarang) {
            double Kembalian = Cash - totalHarga; // OPERASI CASH DIKURANGI HARGA TOTAL
            System.out.println("Terimakasih, kamu telah membeli " + namaBarang + " sejumlah " + jumlahBarang); // OUTPUT HASIL
            System.out.print("Kembalian : " + Kembalian ); // OUTPUT KEMBALIAN
        }
        else if (Cash == hargaBarang) {
            System.out.println("Uang Pas"); // OUTPUT JIKA UANG PAS
            System.out.println("Terimakasih, kamu telah membeli " + namaBarang + " sejumlah " + jumlahBarang); // OUTPUT HASIL
        }
        else {
            System.out.println("Ga cukup woi"); // OUTPUT JIKA UANG TIDAK CUKUP
        }
Sc.close();
    }
    }