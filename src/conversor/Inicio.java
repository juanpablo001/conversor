package conversor;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) {
		Object[] opciones = { "Conversor de Moneda", "Conversor de temperatura" };
		ImageIcon icono = new ImageIcon();

		Object menu = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
				JOptionPane.INFORMATION_MESSAGE, icono, opciones, opciones[0]);

		if (menu == opciones[0]) {

			System.out.println("Se uso la opcion 0");
			Moneda mxntousd = new Moneda();
			mxntousd.menuMonedas();

		} else if (menu == opciones[1]) {

			System.out.println("Se uso la opcion 1");

		}
	}
}
