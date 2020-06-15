package edunova;

public class Zad02 {
public static void main(String[] args) {

	int matrix [][]=matrica();
	
	System.out.println("\n");
	for (int i = 0;i<10; i++) {
		for (int j = 0; j<10; j++) {
			System.out.printf("%d\t", matrix[i][j]);
		}
		System.out.println("\n");
	}
}
public static int [][] matrica(){
	int[][] matrix = new int[10][10];
	for(int i=0;i<10;i++) {
		for(int j=0;j<10;j++) {
			matrix[i][j]=getRandomInteger(20, 10);
		}
	}
	return matrix;
}


public static int getRandomInteger(int maximum, int minimum){
	return ((int) (Math.random()*(maximum - minimum))) + minimum;
}


}
