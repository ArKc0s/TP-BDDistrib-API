package fr.fisa.tpbddistribapi.controller;

import fr.fisa.tpbddistribapi.model.Materiel;
import fr.fisa.tpbddistribapi.service.MaterielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/materiels")
public class MaterielController{

        private final MaterielService materialService;

        @Autowired
        public MaterielController(MaterielService materialService) {
            this.materialService = materialService;
        }

        @PostMapping("/{groupeId}/ajouter-materiel")
        public ResponseEntity<String> ajouterMaterielAuGroupe(
                @PathVariable String groupeId,
                @RequestBody Materiel materiel) {
            materialService.ajouterMaterielAuGroupe(groupeId, materiel);
            return ResponseEntity.ok("Matériel ajouté avec succès au groupe.");
        }
    }

