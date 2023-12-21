package fr.fisa.tpbddistribapi.repository;

import fr.fisa.tpbddistribapi.model.Materiel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielRepository extends MongoRepository<Materiel, String> {
    Materiel findByIdMateriel(int id);
    Materiel findByNumeroDeSerie(String numeroDeSerie);
    void deleteByIdMateriel(int id);
}
