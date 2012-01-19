package user;

import java.awt.Image;

public abstract class Benutzer {
	private String email;
	private String pw;
	
	private String name;
	private String vorname;
	
	private String strasse;
	private String hausnr;
	private String plz;
	private String ort;
	
	private String mobil;
	private String festnetz;
	
	private Image bild;

	public Benutzer(String email, String pw){
		this.email = email;
		this.pw = pw;
	}
	
	private void bearbeitenName(String name, String vorname){
		this.name = name;
		this.vorname = vorname;
	}
	
	private void bearbeitenAdresse(String strasse, String hausnr, String plz, String ort){
		this.strasse = strasse;
		this.hausnr = hausnr;
		this.plz = plz;
		this.ort = ort;		
	}
	
	private void bearbeitenTelefon(String mobil, String festnetz){
		this.mobil = mobil;
		this.festnetz = festnetz;
	}
	
	private void bearbeitenBild(Image bild){
		this.bild = bild;
	}
	
	
}

