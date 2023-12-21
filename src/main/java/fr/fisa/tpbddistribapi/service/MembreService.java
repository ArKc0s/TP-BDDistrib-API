package fr.fisa.tpbddistribapi.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import fr.fisa.tpbddistribapi.model.Membre;
import fr.fisa.tpbddistribapi.repository.MembreRepository;
import java.util.List;
import java.util.Optional;


@Service
public class MembreService {
    private final MembreRepository membreRepository;

    @Autowired
    public MembreService(MembreRepository membreRepository) {
        this.membreRepository = membreRepository;
    }

    // Exemple d'opérations de service
    public List<Membre> getAllMembres() {
        return membreRepository.findAll();
    }

    public Membre getMembreById(int id) {
        return membreRepository.findById(id);
    }

    public Membre getMembreByEmail(String email) {
        return membreRepository.findByEmail(email);
    }

    public Membre saveMembre(Membre membre) {
        return membreRepository.save(membre);
    }

    public void deleteMembre(int id) {
        membreRepository.deleteById(id);
    }
}
