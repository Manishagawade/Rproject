package Com.BikkadIt.Hibernet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Country {
	@Id
	@Column(name="CountryId")
	private int id;
	@Column(name="Nation")
	private String name;
	//@Column(name="PM_Name")
	private String PM;
@OneToOne	
	private Capital capital;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPM() {
		return PM;
	}

	public void setPM(String pM) {
		PM = pM;
	}

	public Capital getCapital() {
		return capital;
	}

	public void setCapital(Capital capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", name=" + name + ", PM=" + PM + ", capital=" + capital + "]";
	}

}
