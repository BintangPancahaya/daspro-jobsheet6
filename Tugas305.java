import java.util.Scanner;
public class Tugas305 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);
        String merk, kategori;
        short ukuran;
        int harga = 0;

        System.out.print("Masukkan Merk Sepatu: ");
        merk = input05.nextLine();
        System.out.print("Masukkan Kategori: ");
        kategori = input05.nextLine();
        System.out.print("Masukkan Ukuran Sepatu: ");
        ukuran = input05.nextShort();
        
        if (merk.equalsIgnoreCase("specs")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                if (ukuran >= 36)
                harga = 800_000; 
                else if (ukuran <= 40) {
                    harga = 800_000;
                }
            }
            System.out.print("Total Harga Sepatu " + harga);
        }
        else if (merk.equalsIgnoreCase("specs")) {
            if (kategori.equalsIgnoreCase("high top")) {
                if (ukuran >= 40)
                harga = 1_200_000; 
                else if (ukuran <= 44) {
                    harga = 1_200_000;
                }
            }
            
            System.out.print("Total Harga Sepatu " + harga);
        }
        else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36)
                harga = 1_000_000; 
                else if (ukuran <= 41) {
                    harga = 1_000_000;
                }
            }
            System.out.print("Total Harga Sepatu " + harga);
        }
        else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41)
                harga = 1_800_000; 
               else if (ukuran <= 44) {
                   harga = 1_800_000;
                }
            }
            System.out.print("Total Harga Sepatu " + harga);
        }
        else if (merk.equalsIgnoreCase("ortus")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36)
                harga = 750_000; 
                else if (ukuran <= 40) {
                    harga = 750_000;
                }
            }
            System.out.print("Total Harga Sepatu " + harga);
        }
        else if (merk.equalsIgnoreCase("ortus")) {
            if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40)
                harga = 1_500_000; 
                else if (ukuran <= 44) {
                    harga = 1_500_000;
                }
            }
            System.out.print("Total Harga Sepatu " + harga);
        } else {
            System.out.print("Data Sepatu Tidak Valid");
        }

    }
}
