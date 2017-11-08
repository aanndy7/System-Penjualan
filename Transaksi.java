class Transaksi {
		public String no_transaksi;
		public String tgl_transaksi;
		

		public void membuat(){
			System.out.print("Masukan nomor transaksi   : ");
			no_transaksi = input.nextLine();
			System.out.print("Masukan tanggal transaksi : ");
			tgl_transaksi = input.nextLine();
		}
			public void ubah(){
				System.out.print("Silahkan masukan nomor transaksi yang akan diubah: ");
				no_transaksi = input.nextLine();
			}
					public void hapus(){
						System.out.print("Silahkan masukan nomor transaksi yang akan dihapus: ");
						no_transaksi = input.nextLine();
		}		
	}