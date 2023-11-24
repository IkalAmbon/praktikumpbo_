package praktikum2;
import java.util.Scanner;

public class PengkondisianIF {
	public static void main(String args[]) {
//	inisialisasi
		int angka1, angka2, hasil,perhitungan;
		Scanner input = new Scanner(System.in);
//		input user 
		System.out.print("Masukan Angka 1: ");
		angka1 = input.nextInt();
		System.out.print("Masukan Angka 2: ");
		angka2 = input.nextInt();
		System.out.print("list perhitungan :"
				+ "\n 1 : pertambahan"
				+ "\n 2 : pengurangan"
				+ "\n 3 : perkalian"
				+ "\n 4 : pembagian"
				+ "\n Masukan angka perhituhngan :");
		perhitungan = input.nextlnt();
//		kondisi IF
		if(perhitungan == 1) {
			hasil = angka1 + angka2;
			System.out.println("hasilnya adalah : "+hasil);
		}else {
			System.out.println("Angka yang dimasukan lebih dari  5");
		}
	}

	

}
