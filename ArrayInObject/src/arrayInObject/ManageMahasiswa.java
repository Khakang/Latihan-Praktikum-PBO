package arrayInObject;

public class ManageMahasiswa {
	private Mahasiswa[] data;
	private int n;

	public ManageMahasiswa(int max) {
		data = new Mahasiswa[max];
		n = 0;
	}
	
	public void insert(String nim, String nama, int umur) {
		data[n] = new Mahasiswa(nim, nama, umur);
		n++;
	}
	
	public void display() {
		for(int j=0; j<n; j++) {
			System.out.print((j+1) + ". ");
			data[j].displayMhs();
		}
		System.out.println("");
	}

}
