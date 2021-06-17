package enkapsulasiDemo;
import java.text.DecimalFormat;

public class DemoEnkapsulasi {
	public static void main(String[] args) {
		DecimalFormat digitpresisi = new DecimalFormat("0.00");
		System.out.println("\nDEMO ENKAPSULASI");
		System.out.println("==================");
		HitungGaji tony = new HitungGaji();
		tony.setGaji(100000000);
		tony.hitungGaji();
		System.out.println("Informasi gaji Pegawai");
		System.out.println("\nBesar Gaji Kotor : "+digitpresisi.format(tony.getgajiKotor()));
		System.out.println("\nBesar Gaji yang Dibawa Pulang : "+digitpresisi.format(tony.getgajiBersih()));
		
	}


}
