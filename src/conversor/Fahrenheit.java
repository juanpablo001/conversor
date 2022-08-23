package conversor;

import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Fahrenheit {
	
	void conversionTemperatura() {
		double temperatura = Inicio.leerValor("Ingresa el valor de temperatura que deseas convertir");
		
		if(temperatura != 0) {
			menuTemp(temperatura);
		}
	}
	
	void menuTemp(double valor) {
		Object[] tiposTemp = {"Cent�grado a Fahrenheit", "Fahrenheit a Centr�grado"};
		ImageIcon icono = new ImageIcon();
		Object selectConver = JOptionPane.showInputDialog(null, "Seleccione una opci�n de conversi�n",
				"Menu", JOptionPane.INFORMATION_MESSAGE, icono, tiposTemp, tiposTemp[0]);
		
		if(selectConver == null) {
			selectConver = "cancelar";
		}
		
		switch (selectConver.toString()) {
		case "Cent�grado a Fahrenheit": resultadoTemp(gctof(valor), "Fahrenheit"); break;
		case "Fahrenheit a Centr�grado": resultadoTemp(ftogc(valor), "Cent�grados"); break;
		case "cancelar": break;
		default: break;
		}
	}
	
	double gctof(double valor) {
		return (valor * 9 / 5) + 32;
	}
	
	double ftogc(double valor ) {
		return (valor - 32) * 5 / 9;
	}
	
	void resultadoTemp(double valor, String unidad) {
		DecimalFormat redondeo = new DecimalFormat("0.0");
		JOptionPane.showMessageDialog(null, "Son " + redondeo.format(valor) + " grados " + unidad,
				"Resultado",JOptionPane.INFORMATION_MESSAGE);
	}
}
