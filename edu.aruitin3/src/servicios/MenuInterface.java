package servicios;

/**
 * This interface is used for all the different menus in our app
 * @author ARM
 */
public interface MenuInterface {
	
	/**
	 * Shows the specific menu
	 */
	public void showMenu();
	
	/**
	 * Grabs the value of the selection specified by our user
	 * @return a byte
	 */
	public byte selectMenuOption();
	
}
