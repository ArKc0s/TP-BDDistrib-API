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

        public void ajouterMaterielAuGroupe(String groupeId, Materiel materiel) {
            Groupe groupe = groupeRepository.findByNumeroGroupe(groupeId);
            if (groupe.isPresent()) {
                String group = groupe.getNumeroGroupe();
                materiel.setIdGroupe(group);
                materielRepository.save(materiel);
            }
        }
    }

