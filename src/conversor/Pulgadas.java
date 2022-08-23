package conversor;

import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Pulgadas {
	
	void conversorPulgadas() {
		double valorLong = Inicio.leerValor("Ingresa el valor de longitud que deseas convertir");
		
		if(valorLong != 0) {
			menuPulgadas(valorLong);
		}
	}
	
	void menuPulgadas(double valor) {
		Object[] tiposTemp = {"Cent�metros a Pulgadas", "Pulgadas a Cent�metros"};
		ImageIcon icono = new ImageIcon();
		Object selectConver = JOptionPane.showInputDialog(null, "Seleccione una opci�n de conversi�n",
				"Menu",	JOptionPane.INFORMATION_MESSAGE, icono, tiposTemp, tiposTemp[0]);
		
		if(selectConver == null) {
			selectConver = "cancelar";
		}
		
		switch (selectConver.toString()) {
		case "Cent�metros a Pulgadas": resultadoLong(cmToIn(valor), "pulgadas"); break;
		case "Pulgadas a Cent�metros": resultadoLong(inToCm(valor), "cent�metros"); break;
		case "cancelar": break;
		default: break;
		}
	}
	
	double cmToIn(double valor) {
		return valor / 2.54;
	}
	
	double inToCm(double valor) {
		return valor * 2.54;
	}
	
	void resultadoLong(double valor, String unidad) {
		DecimalFormat redondeo = new DecimalFormat("0.0");
		JOptionPane.showMessageDialog(null, "Son " + redondeo.format(valor) + " " + unidad,
				"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}

}
