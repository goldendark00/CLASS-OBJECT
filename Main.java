public class Main {

	public static void main(String[] args) {
		Kotak main = new Kotak();
		
		main.setPanjang(10);
		main.setLebar(5);
		
		double panjang = main.getPanjang();
		System.out.println("Panjang : "+panjang);
		
		double lebar = main.getLebar();
		System.out.println("Lebar : "+lebar);
		
		double luas = main.getLuas();
		System.out.println("Luas : "+luas);
		
		double keliling = main.getKeliling();
		System.out.println("Keliling : "+keliling);
		
		Mahasiswa main1 = new Mahasiswa();
		
		main1.setNama("Muhammad Nur Ichsan");
		main1.setNim("D0217007");
		main1.setAlamat("Binanga");
		main1.setGolonganDarah("B");
		main1.setStatus("Mahasiswa");
		main1.setTinggiBadan(175);
		main1.setBeratBadan(95);
		
		String Nama = main1.getNama();
		String Nim = main1.getNim();
		String Alamat = main1.getAlamat();
		String GolonganDarah = main1.getGolonganDarah();
		String Status = main1.getStatus();
		int TinggiBadan = main1.getTinggiBadan();
		int BeratBadan = main1.getBeratBadan();
		
		System.out.println("Nama : "+Nama);
		System.out.println("Nim : "+Nim);
		System.out.println("Alamat : "+Alamat);
		System.out.println("Golongan Darah : "+GolonganDarah);
		System.out.println("Status : "+Status);
		System.out.println("Tinggi Badan : "+TinggiBadan);
		System.out.println("Berat Badan : "+BeratBadan);

		Node main2 = new Node ();
		
			main2.Label = "AQUA";
			main2.Value = 1;

			System.out.println("Nama Label : " + main2.getLabel());
			System.out.println("Jumlah Value : " + main2.getValue());
			System.out.println("--------------------------------------------");
	
		Stack Stack = new Stack();
		
		Stack.value[0] = "Naruto";
		Stack.value[1] = "Sasuke";
		Stack.value[2] = "Sakura";
		Stack.value[3] = "Shikamaru";
		Stack.value[4] = "Choji";
		Stack.value[5] = "Ino";
		Stack.value[6] = "Neji";
		Stack.value[7] = "Rock Lee";
		Stack.value[8] = "Ten Ten";
		Stack.value[9] = "Kiba";
		Stack.value[10] = "Hinata";
		Stack.value[11] = "Shino";
		Stack.value[12] = "Kakashi";
		Stack.value[13] = "Might Guy";
		Stack.value[14] = "Azuma";
		Stack.value[15] = "Kurenai";
		Stack.value[16] = "Tsunade";
		Stack.value[17] = "Minato";
		Stack.value[18] = "Sarutobi";
		Stack.value[19] = "Tobirama";
		Stack.value[20] = "Hasirama";
		Stack.value[21] = "Orochimaru";
		Stack.value[22] = "Kabuto";
		Stack.value[23] = "Suigetsu";
		Stack.value[24] = "Karin";
		Stack.value[25] = "Jugo";
		Stack.value[26] = "Killer Bee";
		Stack.value[26] = "Aii";
		Stack.value[27] = "Palsu";
		Stack.value[28] = "her";
		Stack.value[29] = "musi";
		Stack.value[30] = "ahar";
		Stack.value[31] = "arar";
		Stack.value[32] = "abar";
		Stack.value[33] = "arham";
		Stack.value[34] = "yuhi";
		Stack.value[35] = "dawan";
		Stack.value[36] = "indah";
		Stack.value[37] = "ari";
		Stack.value[38] = "blan";
		Stack.value[39] = "muhammad";
		Stack.value[40] = "ram";
		Stack.value[41] = "kri";
		Stack.value[42] = "uput";
		Stack.value[43] = "wiya";
		Stack.value[44] = "firi";
		Stack.value[45] = "ika";
		Stack.value[46] = "ea";
		Stack.value[47] = "ati";
		Stack.value[48] = "mia";
		Stack.value[49] = "jujul";
		Stack.value[50] = "amir";
		Stack.value[51] = "mira";
		Stack.value[52] = "zera";
		Stack.value[53] = "edi";
		Stack.value[54] = "andi";
		Stack.value[55] = "idal";
		Stack.value[56] = "sawan";
		Stack.value[57] = "lis";
		Stack.value[58] = "sa";
		Stack.value[59] = "afal";
		Stack.value[60] = "nin";
		Stack.value[61] = "nun";
		Stack.value[62] = "sisa";
		Stack.value[63] = "cia";
		Stack.value[64] = "mi";
		Stack.value[65] = "nurah";
		Stack.value[66] = "cic";
		Stack.value[67] = "umami";
		Stack.value[68] = "ayuk";
		Stack.value[69] = "nasul";
		Stack.value[70] = "nii";
		Stack.value[71] = "ekka";
		Stack.value[72] = "egik";
		Stack.value[73] = "andit";
		Stack.value[74] = "tiara";
		Stack.value[75] = "ninja";
		Stack.value[76] = "vivit";
		Stack.value[77] = "fifif";
		Stack.value[78] = "viona";
		Stack.value[79] = "inak";
		Stack.value[80] = "anis";
		Stack.value[81] = "onaa";
		Stack.value[82] = "marumah";
		Stack.value[83] = "anaw";
		Stack.value[84] = "mira";
		Stack.value[85] = "diman";
		Stack.value[86] = "rupiah";
		Stack.value[87] = "kick";
		Stack.value[88] = "sasia";
		Stack.value[89] = "risa";
		Stack.value[90] = "pending";
		Stack.value[91] = "resi";
		Stack.value[92] = "fajar";
		Stack.value[93] = "darliani";
		Stack.value[94] = "hasyim";
		Stack.value[95] = "nagif";
		Stack.value[96] = "aldi";
		Stack.value[97] = "icham";
		Stack.value[98] = "raditya";
		Stack.value[99] = "nisa";
		


		Stack.setValueAt(1, "Naruto");
		
		for (int i=0;i<Stack.value.length;i++){System.out.println(Stack.value[i]);};

	}

}
