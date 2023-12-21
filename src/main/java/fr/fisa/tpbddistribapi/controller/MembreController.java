package fr.fisa.tpbddistribapi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import fr.fisa.tpbddistribapi.model.Membre;
import fr.fisa.tpbddistribapi.service.MembreService;

@RestController
@RequestMapping("/api/membres")
public class MembreController {
    private final MembreService membreService;

    @Autowired
    public MembreController(MembreService membreService) {
        this.membreService = membreService;
    }

    @PostMapping("/inscription")
    public Membre inscrireMembre(@RequestBody Membre membre) {
        // Effectuer des validations si nécessaire
        return membreService.saveMembre(membre);

    }
}
