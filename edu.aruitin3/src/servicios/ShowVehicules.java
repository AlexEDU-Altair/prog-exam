package servicios;

import controladores.Inicio;
import entidades.Vehicule;

/**
 * This class is in charge of showing the necessary entries of our list
 * @author ARM
 */
public class ShowVehicules {
	
	/**
	 * Here we list all the vehicles that match the brand that our user specified
	 */
	public void showVehiculeList() {
		
		String userBrand;
		System.out.println("Introduzca la marca a buscar: ");
		userBrand=Inicio.sc.next();
		
		int loopCounter=0;
		
		boolean brandExists=false;
		
		for (Vehicule veh : Inicio.vehiculeList) {
			
			loopCounter++;
			
			if (veh.getBrand().equalsIgnoreCase(userBrand)) {
				
				brandExists=true;
				System.out.println(veh.toString());
				
			} else if (Inicio.vehiculeList.size()==loopCounter && brandExists==false) {
				
				System.out.println("No existen vehículos con la marca "+userBrand+" en la base de datos.");
				
			}

		}
		
		loopCounter=0;
		
	}
	
}
