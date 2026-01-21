package servicios;

import controladores.Inicio;

/**
 * Implementation of the main menu of the program
 * @author ARM
 */
public class MenuImplementation implements MenuInterface{

	@Override
	public void showMenu() {
		
		System.out.println("< Administración de Vehículos >");
		System.out.println("1. Alta Vehículo.");
		System.out.println("2. Listar Vehículos.");
		System.out.println("3. Acceso panel de administración.");
		System.out.println("4. Cerrar programa.");
		
	}

	@Override
	public byte selectMenuOption() {
		
		byte userOption;
		
		System.out.println("Su opción: ");
		userOption=Inicio.sc.nextByte();
		
		return userOption;
	}

}
