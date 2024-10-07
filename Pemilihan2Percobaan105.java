import java.util.Scanner;
	/**
	 * Pemilihan2Percobaan105
	 */
	public class Pemilihan2Percobaan105 {
	
		public static void main(String[] args) {
			Scanner input05 = new Scanner(System.in);
			int tahun;

				System.out.print("Masukkan tahun: ");
				tahun = input05.nextInt();

				if ((tahun % 400) == 0) {
					System.out.println("Tahun Kabisat");
				} 
			else if (tahun >= 2100) {
				System.out.println("Bukan Tahun Kabisat");
			}
			if ((tahun % 4) == 0) {
				if ((tahun % 100) != 0)
					System.out.println("Tahun Kabisat");
			}
			 else
				System.out.println("Bukan Tahun Kabisat");
		}
	}