import java.util.Scanner;
public class Tugas205 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String hari, jenisBuku;
        double diskon;
        byte buku;

        System.out.print("Masukkan Hari: ");
        hari = input05.nextLine();
        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = input05.nextLine();

        if (hari.equalsIgnoreCase("rabu")) {    
            if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.1;
            System.out.print("Masukkan Jumlah Buku: ");
            buku = input05.nextByte();
            if (buku > 2)
                diskon += 0.02;

         } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            System.out.print("Masukkan Jumlah Buku: ");
            buku = input05.nextByte();
            if (buku > 3)
                diskon += 0.02;

         } else {
         System.out.print("Masukkan Jumlah Buku: ");
         buku = input05.nextByte();
         diskon = 0;
            if (buku > 3)
                diskon += 0.02;
            }
            System.out.print("Total Diskon Yang Anda Dapatkan " + ((int)(diskon * 100)) + "%");
      } else 
        System.out.print("Hari ini tidak ada diskon");
        return;

    } 
}
