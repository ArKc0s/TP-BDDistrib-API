package fr.fisa.tpbddistribapi.repository;

import fr.fisa.tpbddistribapi.model.Materiel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielRepository extends MongoRepository<Materiel, String> {
    Materiel findById_materiel(int id);
    Materiel findByNumero_de_serie(String numero_de_serie);
    void deleteById_materiel(int id);
}
