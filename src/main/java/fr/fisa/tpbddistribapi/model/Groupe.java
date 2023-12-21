package fr.fisa.tpbddistribapi.model;
import org.springframework.data.annotation.Id;

public class Groupe {
    @Id
    private String numero_groupe;
    private String nom;
    private Ville ville;

    public String getNumero_groupe() {
        return numero_groupe;
    }

    public void setNumero_groupe(String numero_groupe) {
        this.numero_groupe = numero_groupe;
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
