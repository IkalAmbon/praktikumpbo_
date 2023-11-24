package praktikum3;
import java.util.Scanner;

public class Latihan {
	public static vold main(String args[]) {
//		inisialisasi
		Scanner input = new Scanner(System.in);
		int angka1, angka2, hasil, perulangan;
		String perhitungan;
//		input perulangan
		System.out.print("Masukkan perlungan : ");
		perulangan = input.nextint();
//		perulangan for
		for(int i = 1; i <= perulangan; i++) {
//			input user
			System.out.print("Msaukan angka 1 : ");
			angka1 = input.nextInt();
			System.out.print("list perhitungan :"
					+ "\n 1 : pertambahan"
					+ "\n 2 : pengurangan"
					+ "\n 3 : perkalian"
					+ "\n 4 : pembagian"
					+ "\n Masukan angka perhituhngan :");
			perhitungan = input.next();
			System.out.print("Masukan Angka 2 : "+hasil);
		}
	}

}
