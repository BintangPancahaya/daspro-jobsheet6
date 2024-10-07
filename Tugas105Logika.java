import java.util.Scanner;
public class Tugas105Logika {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        short bil1, bil2, bil3;

        System.out.print("Masukkan Angka: ");
        bil1 = input05.nextShort();
        System.out.print("Masukkan Angka: ");
        bil2 = input05.nextShort();
        System.out.print("Masukkan Angka: ");
        bil3 = input05.nextShort();

        if ((bil1 >= bil2) && (bil1 >= bil3)) {
            System.out.print("Bilangan Terbesar adalah " + bil1);
        } else if ((bil2 >= bil1) && (bil2 >= bil3)) {
            System.out.print("Bilangan Terbesar adalah " + bil2);
        } else
            System.out.print("Bilangan Terbesar adalah " + bil3);
    }
}
