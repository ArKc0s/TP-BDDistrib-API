package fr.fisa.tpbddistribapi.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import fr.fisa.tpbddistribapi.model.Membre;

@Repository
public interface MembreRepository extends MongoRepository<Membre, String> {
    Membre findById(int id);
    Membre findByEmail(String email);
    void deleteById(int id);

}
