package fr.fisa.tpbddistribapi.model;
import org.springframework.data.annotation.Id;

public class Adresse {
    @Id
    private int id_adresse;
    private int numero;
    private String rue;
    private Ville ville;

    public int getId_adresse() {
        return id_adresse;
    }

    public void setId_adresse(int id_adresse) {
        this.id_adresse = id_adresse;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }
}
