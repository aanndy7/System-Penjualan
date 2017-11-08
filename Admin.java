class Admin {

		public String admincode;
		public String nameadmin;
		

			public void tambah(){

				System.out.print("Masukan kode : ");
				admincode = input.nextLine();
				System.out.print("Masukan nama : ");
				nameadmin = input.nextLine();
				
	}
			public void input(){
				System.out.print("input Nama admin: ");
				nameadmin = input.nextLine();	
	}
			public void update(){
				System.out.print("Update kode admin: ");
				admincode = input.nextLine();	
	}
	
}