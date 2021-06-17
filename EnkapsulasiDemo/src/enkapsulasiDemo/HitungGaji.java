package enkapsulasiDemo;

public class HitungGaji {
	private double gajiKotor,gajiSetelahPajak;
	public double gajiBersih;
	private double potongan = 75000.00;
	public void setGaji(double gaji) {
		gajiKotor = gaji;
	}
	public void hitungGaji() {
		gajiSetelahPajak = gajiKotor-(0.2*gajiKotor);
		gajiBersih = gajiSetelahPajak-potongan;
	}
	public double getgajiKotor() {
		return gajiKotor;
	}
	public double getgajiBersih() {
		return gajiBersih;
	}

}
