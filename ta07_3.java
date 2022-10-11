package project7;

import java.util.Hashtable;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ta07_3 {
	public static void main(String args[]){
		
		Integer producto = 0;
		Double precioProd = 0.0;
		Integer eleccio = 0;
		
		Scanner sc = new Scanner(System.in);		
		
		Hashtable<Integer,Double> stock = new Hashtable<Integer,Double>();  
		
		stock.put(1, 10.0);
		stock.put(2, 20.0);
		stock.put(3, 100.0);
		stock.put(4, 80.0);
		stock.put(5, 40.0);
		stock.put(6, 22.0);
		stock.put(7, 88.0);
		stock.put(8, 1000.0);
		stock.put(9, 400.0);
		stock.put(10, 800.0);				
		
		while (eleccio != 4) {
			switch (eleccio){
			case 0:
				String elecc = JOptionPane.showInputDialog("Elige opcion:\n 1..Mostrar productos\n "
						+ "2..Intorducir productos\n 3..Mostrar un producto\n 4..Finalizar");
				eleccio = Integer.parseInt(elecc);  
				break;
			case 1:
				JOptionPane.showMessageDialog(null, "Stock = "+stock);	
				eleccio = 0;
				break;
			case 2:
				String prod = JOptionPane.showInputDialog("Introduce nuevo producto: ");
				producto = Integer.parseInt(prod);  
				String precioPr = JOptionPane.showInputDialog("Introduce el precio del producto: ");		
				precioProd = Double.parseDouble(precioPr);  				
				stock.put(producto, precioProd);
				eleccio = 0;
				break;
			case 3:
				String product = JOptionPane.showInputDialog("Introduce producto a mostrar: ");
				producto = Integer.parseInt(product);  
				JOptionPane.showMessageDialog(null, "Precio = "+stock.get(producto));
				eleccio = 0;
				break;
			case 4:
				break;
			}
		}														
		
		sc.close();
		
	}

}
