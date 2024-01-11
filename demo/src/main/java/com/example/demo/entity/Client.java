package com.example.demo.entity;

import java.util.List;

public class Client {
	private  Integer id;
	private String nom;
	private String prenom;
	private String email;
	private String tel; 
//	private LocalDateTime creaDate;
	
	
	
	public Client() {
		
	}
	
	
// 	public Client(Integer id, String nom, String prenom, String email, String tel /*LocalDateTime creaDate*/) {
// 		super();
// 		this.id = id;
// 		this.nom = nom;
// 		this.prenom = prenom;
// 		this.email = email;
// 		this.tel = tel;
// //		this.creaDate = creaDate;
// 	}

	public Client(Integer id, String nom, String prenom, String email, String tel) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
	}

	public Client(List byID) {
	}

	public Client(String nom, String prenom, String mail, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.tel = tel;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", tel=" + tel;
	}
	
}
