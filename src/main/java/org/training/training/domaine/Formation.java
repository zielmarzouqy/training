package org.training.training.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {
	
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant formation (Cle primaire)
	
	private String theme; // Th�me formation
	
	// Getters et Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
}
