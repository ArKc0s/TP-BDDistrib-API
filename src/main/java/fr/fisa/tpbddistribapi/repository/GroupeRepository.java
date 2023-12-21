package fr.fisa.tpbddistribapi.repository;
import fr.fisa.tpbddistribapi.model.Groupe;

public interface GroupeRepository {
    Groupe findByNumeroGroupe(String numero_groupe);
    void deleteByNumeroGroupe(String numero_groupe);

}
