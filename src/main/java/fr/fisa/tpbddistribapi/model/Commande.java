package fr.fisa.tpbddistribapi.model;
import java.util.Date;
import java.util.ArrayList;
import org.springframework.data.annotation.Id;

public class Commande {
    @Id
    private int id_commande;
    private String id_membre_client;
    private String id_membre_actif;
    private Date date;
    private ArrayList<Materiel> list;
    private float prix_total;

    public int getId_commande() {
        return id_commande;
    }

    public void setId_commande(int id_commande) {
        this.id_commande = id_commande;
    }

    public String getId_membre_client() {
        return id_membre_client;
    }

    public void setId_membre_client(String id_membre_client) {
        this.id_membre_client = id_membre_client;
    }

    public String getId_membre_actif() {
        return id_membre_actif;
    }

    public void setId_membre_actif(String id_membre_actif) {
        this.id_membre_actif = id_membre_actif;
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

    public float getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(float prix_total) {
        this.prix_total = prix_total;
    }
}
