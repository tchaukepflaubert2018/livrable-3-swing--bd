package com.objis.cameroun.GestionPatients.domaine;

/**
 * classe qui traite les savoirs-faire 
 * dont l'utilisateur fait appel
 * 
 * @author FLAUBERT
 * 
 *@version 1.0 // premiere version de mon programme
 */
public class Patient {
	


	//attributs
 private String nom;
 private String prenom;
 private String quartier;
 private String fonction;
 private int age;
 private String sexe;
 private int matricule;
 
// constructeurs
 
/**
 * constructeur par default 
 * de la classe patient
 */
public Patient(){
	 super();
	 
 }
 /**
 * @param nom = nom
 * @param prenom = prenom
 * @param quartier = quartier
 * @param fonction = fonction
 * @param age = age
 * @param sexe = sexe
 * @param matricule = matricule
 */
public Patient(String nom, String prenom, String quartier, String fonction, int age, String sexe, int matricule){
	 
	this.nom = nom;
   this.prenom = prenom;
   this.quartier = quartier;
   this.fonction = fonction;
   this.age = age;
   this.sexe = sexe;
   this.matricule = matricule;
   }
   // getteurs /setteurs
   /**
 * @return nom
 */
public String getNom(){
	   return nom;
	   
   }
   /**
 * @param nom = nom
 */
public void setNom(String nom){
	   this.nom = nom;
	   
   }
   /**
 * @return prenom
 */
public String getPrenom(){
	   return prenom;
   }
   /**
 * @param prenom = prenom
 */
public void setPrenom(String prenom){
	   this.prenom = prenom;
   }
   /**
 * @return quartier
 */
public String getQuartier(){
	   return quartier;
	   
   }
   /**
 * @param quartier = quartier
 */
public void setQuartier(String quartier){
	   this.quartier = quartier;
   }
   /**
 * @return fonction
 */
public String getFonction(){
	   return fonction;
   }
	/**
	 * @param fonction = fonction
	 */
	public void setFonction(String fonction){
	this.fonction = fonction;
	}
	/**
	 * @return age
	 */
	public int getAge() {
	return age;
}
	/**
	 * @param age = age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return sexe
	 */
	public String getSexe() {
		return sexe;
	}	
		/**
		 * @param sexe = sexe
		 */
		public void setSexe(String sexe) {
			this.sexe = sexe;
	}
	/**
	 * @return matricule
	 */
	public int getMatricule(){
		return matricule;
		
	}
	/**
	 * @param matricule = matricule
	 */
	public void setMatricule(int matricule){
		this.matricule = matricule;
	}
	/**
	 * @param int1
	 */
	public void setIdPatient(int int1) {
		// TODO Auto-generated method stub
		
	}
	public Object getIdPatients() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String toString() {
		return "Patient [nom=" + nom + ", prenom=" + prenom + ", quartier=" + quartier + ", fonction=" + fonction
				+ ", age=" + age + ", sexe=" + sexe + ", matricule=" + matricule + "]";
	}
}
