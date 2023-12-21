package fr.fisa.tpbddistribapi.model;
import org.springframework.data.annotation.Id;

public class Groupe {
    @Id
    private String numeroGroupe;
    private String nom;
    private Ville ville;

    public String getNumeroGroupe() {
        return numeroGroupe;
    }

    public void setNumeroGroupe(String numeroGroupe) {
        this.numeroGroupe = numeroGroupe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public boolean isPresent() {
        return false;
    }
}
