import java.util.Scanner;
public class Tugas105NoLogika {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        short bil1, bil2, bil3;

        System.out.print("Masukkan angka pertama: ");
        bil1 = input05.nextShort();
        System.out.print("Masukkan angka kedua: ");
        bil2 = input05.nextShort();
        System.out.print("Masukkan angka ketiga: ");
        bil3 = input05.nextShort();

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.print("Bilangan Terbesar adalah " + bil1);
            }
        }
        if (bil2 > bil1) {
            if (bil2 > bil3) {
                System.out.print("Bilangan Terbesar adalah " + bil2);
            }
        }
        if (bil3 > bil1) {
            if (bil3 > bil2) {
                System.out.print("Bilangan Terbesar adalah " + bil3);
            }
        } else if (bil1 == bil2) {
            System.out.print("Bilangan Terbesar adalah " + bil2);
        } else if (bil2 == bil3) {
            System.out.print("Bilangan Terbesar adalah " + bil2);
        } else if (bil1 == bil3) {
            System.out.print("Bilangan Terbesar adalah " + bil1);
        }
        
    }
}
