package aplikasiSederhana;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String validasi="";
		int choice=0;
		int menu_choice=0;
		int french_fries=0, fried_chiken=0, fried_rice=0;
		int qty_frenchfries=0, qty_friedchiken=0, qty_friedrice=0;
		int subtotal=0;
		int payment=0;
		int change=0;
		do {
			do {
				validasi="Y";
				System.out.println("\n=== RestoranKu ===");
				System.out.println("1. Menu");
				System.out.println("2. Pembayaran");
				System.out.println("3. Exit");
				System.out.println(">> Pilihan : ");
				try {
					choice = in.nextInt();
					if(choice != 1 && choice != 2 && choice != 3) {
						validasi="N";
					}
				}
			catch(Exception e) {
				validasi="N";
				in.nextLine();
			}
			if(validasi=="N") {
				System.out.println(" >> Salah Inputan\n");
			}
			} while(validasi=="N");
		
		switch(choice) 
		{
		case 1 : 
			do {
				validasi="Y";
				System.out.println("Menu");
				System.out.println("1. Nasi Goreng \t [Rp 15.000 ]");
				System.out.println("2. Mie Goreng \t [Rp 15.000 ]");
				System.out.println("3. Bakso \t [Rp 10.000 ]");
				System.out.println("4. Back");
				System.out.println(">> Choise : ");
				try {
					menu_choice = in.nextInt();
					if(menu_choice != 1 && menu_choice != 2 && menu_choice != 3 && menu_choice != 4) {
						validasi="N";
					}
				}
			catch(Exception e) {
				validasi="N";
				in.nextLine();
			}
			}while(validasi=="N");
		
		switch(menu_choice) {
		case 1:
			french_fries = 1;
			do {
				validasi="Y";
			System.out.print(">> Quantity [1 - 10] : ");
			try {
				qty_frenchfries = in.nextInt();
				
				if(qty_frenchfries < 1 || qty_frenchfries > 10) {
					validasi="N";
				}
			}catch(Exception e) {
				validasi="N";
				in.nextLine();
			}
			if(validasi=="N") {
				System.out.println(" >> Salah Inputan");
			}
			}while(validasi=="N");
			
			System.out.println("== Pesanan Anda : "+qty_frenchfries+" Nasi Goreng ==");
			System.out.println("== Silahkan Menuju Menu Pembayaran untuk Menyelesaikan Transaksi ==");
			break;
		
		case 2:
			fried_chiken = 1;
			do {
				validasi="Y";
				System.out.print(">> Quantity [1 - 10] : ");
				try {
					qty_friedchiken = in.nextInt();
					if(qty_friedchiken < 1 || qty_friedchiken > 10) {
						validasi="N";
					}
				}catch(Exception e) {
					validasi="N";
					in.nextLine();
				}
				if(validasi=="N") {
					System.out.println(" >> Salah Inputan");
				}
			}while(validasi=="N");
			System.out.println("== Pesanan Anda : "+qty_friedchiken+" Mie Goreng ==");
			System.out.println("== Silahkan Menuju Menu Pembayaran untuk menyelesaikan transaksi ==");
			break;
		
		case 3:
			fried_rice = 1;
			do {
				validasi="Y";
				System.out.print(">> Quantity [1 - 10] : ");
				try {
					qty_friedrice = in.nextInt();
					if(qty_friedrice < 1 || qty_friedrice > 10) {
						validasi="N";
					}
				}catch(Exception e) {
					validasi="N";
					in.nextLine();
				}
				if(validasi=="N") {
					System.out.println(" >> Salah Inputan");
				}
			}while(validasi=="N");
				System.out.println("== Pesanan Anda : "+qty_friedrice+" Bakso ==");
				System.out.println("== Silahkan Menuju Menu Pembayaran untuk Menyelesaikan Transaksi ==");
			break;
		case 4:
			break;
		}
		
			break;
		case 2 :
			System.out.println("Pembayaran");
			
			if(french_fries==0 && fried_chiken==0 && fried_rice==0) {
				System.out.println("== Anda Tidak Memesan Apapun ==");
				System.out.println("== Silahkan Ke Menu Order Untuk Memesan ==");
				break;
			}
			int total_frenchfries=0, total_friedchiken=0, total_friedrice=0;
			
			if(french_fries == 1) {
				total_frenchfries = 15000 * qty_frenchfries;
			}
			if(fried_chiken == 1) {
				total_friedchiken = 15000 * qty_friedchiken;
			}
			if(fried_rice == 1) {
				total_friedrice = 10000 * qty_friedrice;
			}
			subtotal = total_frenchfries + total_friedchiken + total_friedrice;
			System.out.println("== Your Orders are : ==");
			System.out.println(qty_frenchfries + " Nasi Goreng \t Rp15.000 \t : Rp. "+total_frenchfries);
			System.out.println(qty_friedchiken + " Mie Goreng \t Rp15.000 \t : Rp. "+total_friedchiken);
			System.out.println(qty_friedrice + " Bakso \t Rp10.000 \t : Rp. "+total_friedrice);
			System.out.println("== Subtotal : Rp. "+subtotal+ " ==");
			
			do {
				validasi="Y";
			System.out.println("\n\n\n Uang Anda : ");
			try {
				payment = in.nextInt();
				if(payment < subtotal) {
					validasi="N";
					System.out.println(" >> Tidak Tersedia");
				}
			}
			catch(Exception e) {
				validasi="N";
				System.out.println(" >> Salah Inputan");
				in.nextLine();
			}
			} while(validasi=="N");
			
			if(payment == subtotal) {
				System.out.println("== Pembayaran Sukses ==");
				System.out.println("== Terimakasih Telah Berkunjung :) ==");
			}
			else if(payment > subtotal) {
				change = payment - subtotal;
				System.out.println("== Kembalian : Rp. "+change+" ==");
				System.out.println("== Pembayaran Sukses! ==");
				System.out.println("== Terima Kasih Telah Berkunjung :) ==");
			}
			french_fries=0;
			fried_chiken=0;
			fried_rice=0;
			break;
		case 3:
			System.exit(0);
			break;
		}
	}while(true);

	}

}
