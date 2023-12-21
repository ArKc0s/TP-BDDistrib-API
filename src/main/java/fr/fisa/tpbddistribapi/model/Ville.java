package fr.fisa.tpbddistribapi.model;

import org.springframework.data.annotation.Id;

public class Ville {
    @Id
    private int id_ville;
    private String nom;
    private int code_postal;
}
