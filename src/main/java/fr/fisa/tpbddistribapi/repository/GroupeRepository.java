package fr.fisa.tpbddistribapi.repository;
import fr.fisa.tpbddistribapi.model.Groupe;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupeRepository {
    Groupe findByNumeroGroupe(Long numero_groupe);
    void deleteByNumeroGroupe(String numero_groupe);

}
