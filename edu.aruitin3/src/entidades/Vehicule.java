package entidades;

import java.time.LocalDate;

/**
 * Our object "Vehicule" with its attributes
 * @author ARM
 */
public class Vehicule {
	
	//Attributes
	private String brand;
	private String model;
	private String licensePlate;
	private String type;
	private LocalDate registrationDate=LocalDate.now();
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	
	@Override
	public String toString() {
		return "Matrícula: "+licensePlate+"\n"+"Fecha de alta: "+registrationDate+"\n";
	}
	
}
