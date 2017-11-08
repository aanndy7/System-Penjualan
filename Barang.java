class Barang {
		public String id_barang;
		public String nama_barang;
		public String jumlah;

		public void tambah(){
			System.out.print("Masukan id_barang   : ");
			kode_barang = input.nextLine();
			System.out.print("Masukan nama barang   : ");
			nama_barang = input.nextLine();
			System.out.print("Masukan jumlah barang : ");
			jumlah = input.nextLine();
		}
		public void ubah(){
			System.out.print("Ubah id barang: ");
			id_barang = input.nextLine();
		}
		public void hapus(){
			System.out.print("hapus id barang: ");
			id_barang = input.nextLine();
		}
		public void merek(){
			System.out.print("Masukan merek barang: ");
			nama_barang = input.nextLine();
		}
	}