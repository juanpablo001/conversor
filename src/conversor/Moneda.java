package conversor;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Moneda{
	/*
	private final Object[] monedas = {"Pesos a Dólar","Pesos a Euro","Pesos a Libras","Pesos a Yen",
			"Pesos a Real","Dólar a Pesos","Euro a Pesos","Libras a Pesos","Yen a Pesos",
			"Real a Pesos"};
	*/
	
	private final Object[] opciones = { "Si", "No" };
	
	private static final DecimalFormat redondeo = new DecimalFormat("0.00");
	
	void menuMonedas() {
		double cantidad = 0;
		int termina = 1;

		do {
			
			try {
				cantidad = Double.parseDouble(
						JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir",
								"Ingresar cantidad", JOptionPane.QUESTION_MESSAGE));
				
				System.out.println("Ingresó " + redondeo.format(cantidad) + " MXN");
				
				System.out.println("Convertidos en " + redondeo.format(pesosmxADolar(cantidad)) + " USD");
				
				JOptionPane.showMessageDialog(null, "Tienes $ " + redondeo.format(pesosmxADolar(cantidad)) + " USD", "Resultado",JOptionPane.INFORMATION_MESSAGE);

			} catch (NumberFormatException error) {
				
				System.out.println("Valor no válido, escribe solo números o decimal");
				
				JOptionPane.showMessageDialog(null, "Valor no válido, escribe solo números o decimal", "Error",
						JOptionPane.ERROR_MESSAGE);
				
			}
			
			termina = JOptionPane.showOptionDialog(null, "¿Desea continuar?", "Selecciona una opción", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]);
			System.out.println(termina);
			
		} while (termina == 0);
	}
	
	double pesosmxADolar(double valor) {
		return valor*0.0484;
	}
	
	double dolarAPesosmx(double valor) {
		return valor*20.6587;
	}
	
	double pesosmxAEuro(double valor) {
		return valor*0.0492;
	}
	
	double euroAPesosmx(double valor) {
		return valor*20.339991;
	}
}
