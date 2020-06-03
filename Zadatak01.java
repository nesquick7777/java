package edunova;

import javax.swing.JOptionPane;

public class Zadatak01 {
	
public static void main(String[] args) {
	int i = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 1"));
	int j = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 2"));
	int k = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj 3"));
	
	if(i>j && i>k) {
		System.out.println("najveci " +i);
	}else if(j>i && j>k){
		System.out.println("najveci " +j);
	}else if(k>i && k>j){
		System.out.println("najveci " +k);
	}else {
		System.out.println("najveci " +i);
	}
}
	
}
