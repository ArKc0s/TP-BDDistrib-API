package fr.fisa.tpbddistribapi.model;
import java.util.Date;
import java.util.ArrayList;
import org.springframework.data.annotation.Id;

public class Commande {
    @Id
    private int idCommande;
    private String idMembreClient;
    private String idMembreActif;
    private Date date;
    private ArrayList<Materiel> list;
    private float prixTotal;

    public int getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public String getIdMembreClient() {
        return idMembreClient;
    }

    public void setIdMembreClient(String idMembreClient) {
        this.idMembreClient = idMembreClient;
    }

    public String getIdMembreActif() {
        return idMembreActif;
    }

    public void setIdMembreActif(String idMembreActif) {
        this.idMembreActif = idMembreActif;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Materiel> getList() {
        return list;
    }

    public void setList(ArrayList<Materiel> list) {
        this.list = list;
    }

    public float getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(float prixTotal) {
        this.prixTotal = prixTotal;
    }
}
