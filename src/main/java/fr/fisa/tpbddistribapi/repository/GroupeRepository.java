package fr.fisa.tpbddistribapi.repository;
import fr.fisa.tpbddistribapi.model.Groupe;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface GroupeRepository extends MongoRepository<Groupe, String> {
    Groupe findByNumeroGroupe(String numeroGroupe);
    void deleteByNumeroGroupe(String numeroGroupe);

}
