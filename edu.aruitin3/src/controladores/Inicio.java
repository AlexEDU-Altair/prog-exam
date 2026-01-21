package controladores;

import java.util.ArrayList;
import java.util.Scanner;

import entidades.Vehicule;
import servicios.MenuImplementation;
import servicios.RegisterVehicule;
import servicios.ShowVehicules;
import servicios.SubMenuimplementation;
import servicios.UnlistVehicules;

/**
 * This class starts up the whole program
 * @author ARM
 */
public class Inicio {

	public static Scanner sc=new Scanner(System.in);
	public static ArrayList<Vehicule> vehiculeList=new ArrayList<>();
	
	/**
	 * Method in charge of controlling when and under what circumstances
	 * call other functionality in the program
	 * @param args
	 */
	public static void main(String[] args) {
		
		MenuImplementation mi=new MenuImplementation();
		RegisterVehicule rv=new RegisterVehicule();
		ShowVehicules sv=new ShowVehicules();
		UnlistVehicules uv=new UnlistVehicules();
		SubMenuimplementation smi=new SubMenuimplementation();
		
		boolean isMenuClosed=false;
		boolean isSubMenuClosed=false;
		byte userMenuOption;
		byte userSubMenuOption;
		
		do {
			
			mi.showMenu();
			userMenuOption=mi.selectMenuOption();
			
			switch(userMenuOption) {
			case 1:
				rv.createNewVehicule();
				break;
			case 2:
				sv.showVehiculeList();
				break;
			case 3:
				
				do {
				
					smi.showMenu();
					userSubMenuOption=smi.selectMenuOption();
					
					switch(userSubMenuOption) {
					case 1:
						uv.removeVehiculeInList();
						break;
					case 2:
						isSubMenuClosed=true;
						break;
					default:
						
						break;
					}
					
				}while(!isSubMenuClosed);
				
				break;
			case 4:
				isMenuClosed=true;
				System.out.println("El programa se ha cerrado con éxito.");
				break;
			default:
				System.out.println("La opción seleccionada no es válida, por favor, vuélvalo a intentar.");
				break;
			}
			
		}while(!isMenuClosed);
		
		sc.close();
		
	}

}
