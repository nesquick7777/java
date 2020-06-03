package edunova;

import javax.swing.JOptionPane;

public class Zadatak01 {
	
public static void main(String[] args) {
	int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 1"));
	int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 2"));
	int k = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 3"));
	
	if(i>j && i>k) {
		System.out.println("1. je najveci");
	}else if(j>i && j>k){
		System.out.println("1. je najveci");
	}else if(k>i && k>j){
		System.out.println("3. je najveci");
	}else {
		System.out.println("Ima jednakih");
	}
}
	
}
