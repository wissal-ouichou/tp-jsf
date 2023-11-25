/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author WISSAL
 */
@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private String photo;
  
    @ManyToOne
    private Employe chef;
	
    @ManyToOne
    private Service service;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateDeNaisssance() {
		return dateNaissance;
	}
	public void setDateDeNaisssance(Date dateDeNaisssance) {
		this.dateNaissance = dateDeNaisssance;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
    

    public Employe getChef() {
        return chef;
    }

    public void setChef(Employe chef) {
        this.chef = chef;
    }
    

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateDeNaissance) {
        this.dateNaissance = dateDeNaissance;
    }
    
}


