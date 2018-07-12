package model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Cinema {
	
	@NotNull
	private String name;
	
	@NotNull
	private String coordinates;
	
	@NotNull
	private String address;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long cinemaId;
	
	public Cinema(String name, String location) {
		super();
		this.name = name;
		this.coordinates = location;
		this.address = address;
	}
	
	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getCoordinates() {
		return coordinates;
	}


	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}


	public Long getCinemaId() {
		return cinemaId;
	}

}
