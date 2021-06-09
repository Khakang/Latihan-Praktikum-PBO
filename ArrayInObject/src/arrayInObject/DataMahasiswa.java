package arrayInObject;

public class DataMahasiswa {

	public static void main(String[] args) {
		int maxSize = 100;
		ManageMahasiswa obj = new ManageMahasiswa(maxSize);
		obj.insert("116705000", "Andre", 24);
		obj.insert("116705001", "Parto", 24);
		obj.insert("116705002", "Sule", 24);
		obj.insert("116705003", "Aziz", 24);
		obj.insert("116705004", "Nunung", 24);
		System.out.println("Data Mahasiswa : ");
		obj.display();
	}

}