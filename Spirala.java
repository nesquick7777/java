package edunova;

import javax.swing.JOptionPane;

public class Spirala {
public static void main(String[] args) {
	
	int r,s;
	do {
	r= Integer.parseInt(JOptionPane.showInputDialog("Broj redaka"));
	s= Integer.parseInt(JOptionPane.showInputDialog("Broj stupaca"));
	}while(r<=0 || s<=0);
	int[][] matrix = new int[r][s];
	
	int i = 0;
	int j=0;
	
	int temp=1;
	int w=1;
	boolean u= false;
	boolean p = true;
	boolean l = false;
	boolean z = true;

while(w!=(r+s)){
	for (i = r - w; l ? i < r - w : i >= 0 + (w - 1); ) {
	     if (z) {
			j = s - w;
		        }
	         else {
		             j = 0 + (w - 1);
	              }
	for (; z ? j >= 0 + (w - 1) : j <= s - w;) {
		 if (z) {
		 if (p) {
			 matrix[i][j] = temp++;
						j--;
				}
			else if (u && j == 0 + (w - 1)) 
			 {
				matrix[i][j] = temp++;
			 j--;
			 }
			else 
			 {
		     j--;
		     }
			if (j == 0 + (w - 1)) {
						u = true;
						p = false;
					              }
				}
			else {
					if (i == 0 + (w - 1)) {
						matrix[i][j] = temp++;
						j++;
					}
					else if (j == s - w) {
						matrix[i][j] = temp++;
						j++;
					}
					else {
						j++;
					}
				}
			}
			if (l) {
				i++;
			}
			else {
				i--;
			}
			if (i == 0 + (w - 1)) {
				l = true;
				z = false;
			}
		}
		l = false;
		z = true;
		p = true;
		u = false;
		w++;
	}
	

	System.out.println("\n");
	for (i = 0;r>i; i++) {
		for (j = 0; s>j; j++) {
			System.out.printf("%d\t", matrix[i][j]);
		}
		System.out.println("\n");
	}

}
}
