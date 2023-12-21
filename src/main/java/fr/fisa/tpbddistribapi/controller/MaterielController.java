package fr.fisa.tpbddistribapi.controller;

import fr.fisa.tpbddistribapi.model.Materiel;
import fr.fisa.tpbddistribapi.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/materiels")
public class MaterielController{

        private final MaterielService groupeService;

        @Autowired
        public MaterielController(MaterielService groupeService) {
            this.groupeService = groupeService;
        }

        @PostMapping("/{groupeId}/ajouter-materiel")
        public ResponseEntity<String> ajouterMaterielAuGroupe(
                @PathVariable Long groupeId,
                @RequestBody Materiel materiel) {
            groupeService.ajouterMaterielAuGroupe(groupeId, materiel);
            return ResponseEntity.ok("Matériel ajouté avec succès au groupe.");
        }
    }

