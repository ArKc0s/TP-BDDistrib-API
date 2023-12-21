package fr.fisa.tpbddistribapi.model;
import org.springframework.data.annotation.Id;

public class Membre {
    @Id
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private boolean actif;
    private Adresse adresse;
    private int id_groupe;

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public void setId_groupe(int id_groupe) {
        this.id_groupe = id_groupe;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActif() {
        return actif;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public int getId_groupe() {
        return id_groupe;
    }
}
