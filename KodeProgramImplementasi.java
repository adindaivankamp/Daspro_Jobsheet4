import java.util.Scanner;
public class KodeProgramImplementasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jumlahHalaman;
        double dis, total, bayar, jmlDis;
        String merkBuku;

        System.out.println("Masukkan merk buku yang dibeli: ");
        merkBuku=input.next();
        System.out.println("Masukkan jumlah halaman buku yang dibeli: ");
        jumlahHalaman=input.nextInt();
        System.out.println("Masukkan harga barang yang dibeli: ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah barang yang dibeli: ");
        jumlah=input.nextInt();
        System.out.print("Masukkan besaran diskon : ");
        dis = input.nextDouble();

        total = harga * jumlah * jumlahHalaman;
        jmlDis = total * dis;
        bayar = total - jmlDis;

        System.out.println("Merk buku yang dibeli adalah: " + merkBuku);
        System.out.println("Jumlah halaman buku yang dibeli adalah: " + jumlahHalaman);
        System.out.println("Total harga barang adalah: " + total);
        System.out.println("Diskon yang anda dapatkan adalah: " + jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah: " + bayar);

    }
}