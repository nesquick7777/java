package edunova;

import java.util.Arrays;

public class Zadatak4 {
	
	// Program definira cjelobrojnu matricu 10x10 
	// te na dijagonale
	// postavlja vrijednosti 1
	// koristeći for petlju
	
	public static void main(String[] args) {
		int[][] t = new int[10][10];
		for(int i=0, j=9;i<10;i++) {
			t[i][i]=1;
			t[i][j--]=1;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(Arrays.toString(t[i]));
		}
		
	}

}
