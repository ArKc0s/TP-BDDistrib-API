package fr.fisa.tpbddistribapi.model;

import org.springframework.data.annotation.Id;

public class Ville {
    @Id
    private int idVille;
    private String nom;
    private int code_postal;
}
