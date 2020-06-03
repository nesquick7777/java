package edunova;

import javax.swing.JOptionPane;

public class Zadatak002 {
	public static void main(String[] args) {
		
int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 1"));
		
if(i>5 && i < 1) {
	System.out.println("Nije dobar broj");
}else {
	switch(i) {
	 case 1:
		 System.out.println("nedovoljan");
		    break;
		  case 2:
			  System.out.println("dovoljan");
		    break;
		  case 3:
			  System.out.println("dobar");
			    break;
		  case 4:
			  System.out.println("vrlo dobar");
			    break;
		  case 5:
			  System.out.println("odlican");
			    break;
		  default:
		    System.out.println("Krivi broj");
	}
}
	}
}
