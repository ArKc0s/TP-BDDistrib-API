package fr.fisa.tpbddistribapi.service;
import fr.fisa.tpbddistribapi.repository.GroupeRepository;
public class GroupeService {
    private final GroupeRepository groupeRepository;

    public GroupeService(GroupeRepository groupeRepository) {
        this.groupeRepository = groupeRepository;
    }
}
