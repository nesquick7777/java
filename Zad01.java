package edunova;

import javax.swing.JOptionPane;

public class Zad01 {

	public static void main(String[] args) {
	int a= Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
	int b= Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
	System.out.println("suma: " +operacije0(a,b));
	System.out.println("razlika: " +operacije1(a,b));
	System.out.println("produkt: " +operacije2(a,b));
	System.out.println("kvocijent: " +operacije3(a,b));
	}
	
	static int operacije0( int a, int b) {
		int suma=0;
		suma = a+b;
		return suma;
	}
	static int operacije1(int a, int b) {
		int razlika=0;
		razlika = a-b;
		return razlika;
	}
	static int operacije2(int a, int b) {
		int produkt=0;
		produkt = a * b;
		return produkt;
	}
	static double operacije3(int a, int b) {
		double kvocijent=0;
		kvocijent = (float)a/b;
		return kvocijent;
	}
}
