package fr.fisa.tpbddistribapi.service;

import fr.fisa.tpbddistribapi.model.Groupe;
import fr.fisa.tpbddistribapi.model.Materiel;
import fr.fisa.tpbddistribapi.repository.GroupeRepository;
import fr.fisa.tpbddistribapi.repository.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterielService {
        private final GroupeRepository groupeRepository;
        private final MaterielRepository materielRepository;

        @Autowired
        public MaterielService(GroupeRepository groupeRepository, MaterielRepository materielRepository) {
            this.groupeRepository = groupeRepository;
            this.materielRepository = materielRepository;
        }

        public void ajouterMaterielAuGroupe(Long groupeId, Materiel materiel) {
            Groupe Groupe = groupeRepository.findByNumeroGroupe(groupeId);
            if (Groupe.isPresent()) {
                String group = Groupe.getNumero_groupe();
                materiel.setId_groupe(group);
                materielRepository.save(materiel);
            }
        }
    }

