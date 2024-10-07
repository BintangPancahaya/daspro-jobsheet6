import java.util.Scanner;
    /**
     * Pemilihan2Percobaan305
     */
    public class Pemilihan2Percobaan305 {
    
        public static void main(String[] args) {
            Scanner input05 = new Scanner(System.in);
            String kategori;
            int penghasilan;
            double pajak = 0;
            int gajiBersih;

            System.out.print("Masukkan Kategori: ");
            kategori = input05.nextLine();
            System.out.print("Masukkan Penghasilan: ");
            penghasilan = input05.nextInt();

            if (kategori.equalsIgnoreCase("pekerja")) {
                if (penghasilan <= 2_000_000)
                pajak = 0.1;
                else if (penghasilan <= 3_000_000)
                pajak = 0.15;
                else 
                pajak = 0.2;
                gajiBersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.print("Penghasil Bersih : " + gajiBersih);
                
            }
            else if (kategori.equalsIgnoreCase("pebisnis")) {
                if (penghasilan <= 2_500_000)
                pajak = 0.15;
                else if (penghasilan <= 3_500_000)
                pajak = 0.2;
                else 
                pajak = 0.25;
                gajiBersih = (int) (penghasilan - (pajak * penghasilan));
                System.out.print("Penghasil Bersih : " + gajiBersih);
                
            } else 
            System.out.println("Masukkan Kategori Salah ");
        }
    }