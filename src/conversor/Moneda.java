package conversor;

import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Moneda{
	
	private static final DecimalFormat redondeo = new DecimalFormat("#,##0.00");
	
	void conversionMoneda() {
		double cantidad = Inicio.leerValor("Ingresa la cantidad de dinero que deseas convertir");
		
		if(cantidad != 0) {
			menuConver(cantidad);
		}
	}
	
	void menuConver(double valor) {
		ImageIcon icono = new ImageIcon();
		Object[] conversiones = {"Peso MX a Dólar","Peso MX a Euro","Peso MX a Libra","Peso MX a Yen",
				"Peso MX a Real","Dólar a Peso MX","Euro a Peso MX","Libra a Peso MX","Yen a Peso MX",
				"Real a Peso MX"};
		
		Object selectConver = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión",
				"Menu", JOptionPane.INFORMATION_MESSAGE, icono, conversiones, conversiones[0]);
		
		if(selectConver == null) {
			selectConver = "cancelar";
		}
		
		switch (selectConver.toString()) {
		case "Peso MX a Dólar": resultado(pesosmxADolar(valor),"Dólar"); break;
		case "Dólar a Peso MX": resultado(dolarAPesosmx(valor),"Peso MX"); break;
		case "Peso MX a Euro": resultado(pesosmxAEuro(valor),"Euro"); break;
		case "Euro a Peso MX": resultado(euroAPesosmx(valor),"Peso MX"); break;
		case "Peso MX a Libra": resultado(pesosmxALibra(valor),"Libra");break;
		case "Libra a Peso MX": resultado(libraAPesosmx(valor),"Peso MX"); break;
		case "Peso MX a Yen": resultado(pesosAYen(valor),"Yen"); break;
		case "Yen a Peso MX": resultado(yenAPesosmx(valor),"Peso MX"); break;
		case "Peso MX a Real": resultado(pesosAReal(valor),"Real"); break;
		case "Real a Peso MX": resultado(realAPesosmx(valor),"Peso MX"); break;
		case "cancelar": break;
		default: break;
		}
		
	}
	
	void resultado(double valor, String moneda) {
		JOptionPane.showMessageDialog(null, "Tienes $" + redondeo.format(valor) + " " + moneda,
				"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
	
	double pesosmxADolar(double valor) {
		return valor*0.0475;
	}
	
	static double dolarAPesosmx(double valor) {
		return valor*21.034;
	}
	
	static double pesosmxAEuro(double valor) {
		return valor*0.0494;
	}
	
	static double euroAPesosmx(double valor) {
		return valor*20.2598;
	}
	
	static double pesosmxALibra(double valor) {
		return valor*0.0419;
	}
	
	static double libraAPesosmx(double valor) {
		return valor*23.857599;
	}
	
	static double pesosAYen(double valor) {
		return valor*6.7880;
	}
	
	static double yenAPesosmx(double valor) {
		return valor*0.147319;
	}
	
	static double pesosAReal(double valor) {
		return valor*0.2562;
	}
	
	static double realAPesosmx(double valor) {
		return valor*3.9031;
	}
}
