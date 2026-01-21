package servicios;

import controladores.Inicio;

/**
 * This class implements the sub menu of our app
 * @author ARM
 */
public class SubMenuimplementation implements MenuInterface {

	@Override
	public void showMenu() {
		
		System.out.println("< Panel de Administración >");
		System.out.println("1. Baja de vehículo.");
		System.out.println("2. Volver al menú principal.");
		
	}

	@Override
	public byte selectMenuOption() {
		
		byte userOption;
		
		System.out.println("Su opción: ");
		userOption=Inicio.sc.nextByte();
		
		return userOption;
	}

}
