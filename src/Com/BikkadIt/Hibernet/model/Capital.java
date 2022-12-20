package Com.BikkadIt.Hibernet.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Capital {
	
@Id
@Column(name="Capital_Id")
private int idz;

@Column(name="Capital_Name")
private String name;



public int getIdz() {
	return idz;
}

public void setIdz(int idz) {
	this.idz = idz;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Capital [idz=" + idz + ", name=" + name + "]";
}




}
