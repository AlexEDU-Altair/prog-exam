package servicios;

import controladores.Inicio;
import entidades.Vehicule;

/**
 * Class in charge of registering into our system all the different vehicles
 * @author ARM
 */
public class RegisterVehicule {
	
	/**
	 * We ask the user to fill all the necessary details of our potential new object in our 
	 * ArrayList
	 */
	public void createNewVehicule() {
		
		Vehicule newVehicule=new Vehicule();
		
		Inicio.sc.nextLine();
		
		System.out.println("Tipo de vehículo: ");
		newVehicule.setType(Inicio.sc.nextLine());
		
		System.out.println("Modelo: ");
		newVehicule.setModel(Inicio.sc.nextLine());
		
		System.out.println("Marca: ");
		newVehicule.setBrand(Inicio.sc.next());
		
		System.out.println("Matrícula: ");
		newVehicule.setLicensePlate(Inicio.sc.next());
		
		boolean licensePlateExists=false;
		
		for (Vehicule veh : Inicio.vehiculeList) {
			
			if (veh.getLicensePlate().equalsIgnoreCase(newVehicule.getLicensePlate())) {
				licensePlateExists=true;
			}
			
		}
		
		if (licensePlateExists==true) {
			System.out.println("La matrícula no es válida, por favor, vuélvalo a intentar.");
		} else {
			System.out.println("El vehículo se ha registrado con éxito.");
			Inicio.vehiculeList.add(newVehicule);
		}
		
		licensePlateExists=false;
		
		//System.out.println(newVehicule.toString()); <-- This is merely temporal, remove later Alex.
		
	}
	
}
