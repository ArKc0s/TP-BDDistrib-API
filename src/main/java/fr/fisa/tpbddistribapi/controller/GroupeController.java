package fr.fisa.tpbddistribapi.controller;
import fr.fisa.tpbddistribapi.service.GroupeService;

public class GroupeController {
    private final GroupeService groupeService;

    public GroupeController(GroupeService groupeService) {
        this.groupeService = groupeService;
    }
}
