package fr.fisa.tpbddistribapi.service;
import fr.fisa.tpbddistribapi.repository.GroupeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupeService {
    private final GroupeRepository groupeRepository;

    @Autowired
    public GroupeService(GroupeRepository groupeRepository) {
        this.groupeRepository = groupeRepository;
    }
}
