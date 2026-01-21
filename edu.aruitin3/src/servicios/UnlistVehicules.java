package servicios;

import controladores.Inicio;
import entidades.Vehicule;

/**
 * Class that is used for unlisting and removing objects from our list
 * @author ARM
 */
public class UnlistVehicules {
	
	/**
	 * Here we prompt the user for a license plate to identify what entry to delete
	 */
	public void removeVehiculeInList() {
		
		String userLicensePlate;
		System.out.println("Introduzca la matrícula del vehículo a dar de baja: ");
		userLicensePlate=Inicio.sc.next();
		
		boolean licensePlateFound=false;
		
		for (Vehicule veh : Inicio.vehiculeList) {
			
			if (userLicensePlate.equalsIgnoreCase(veh.getLicensePlate())) {
				
				licensePlateFound=true;
				Inicio.vehiculeList.remove(veh);
				System.out.println("El vehículo de matrícula "+veh.getLicensePlate()+" ha sido dado de baja correctamente.");
				break;
				
			}
			
		}
		
		if (!licensePlateFound) {
			
			removeVehiculeInList();
			
		}
		
	}
	
}
