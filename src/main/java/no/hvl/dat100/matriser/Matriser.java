package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
		for(int[] matrise1 : matrise) {
			
			for(int element : matrise1)
			System.out.println(element + " ");
		}
		System.out.println();
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		if(matrise == null) {
			return "null";
		}
		String tekst = ""; 
		
		for(int i = 0; i < matrise.length; i++) {
			for( int j = 0; j < matrise[i].length; j++) {
			tekst += matrise[i][j];
				
				tekst += " ";
		}
			if(i < matrise.length -1) {
				tekst += "\n";
			}
				
		}
		return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
			
		int [][] newMat = new int[matrise.length][matrise[0].length]; 
		
		for(int i = 0; i < matrise.length; i++) {
			for(int j = 0; j < matrise[i].length; j++) {
				
				newMat [i][j] = matrise[i][j] * tall;
			}
			
		}
		return newMat;
	}
	
	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i].length != b[i].length) {
				return false;
			}
			for(int j =0; j < a[i].length; j++) {
				if(a[i][j] != b[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
}
