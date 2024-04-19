package de.netzkronehd.itplus.dockerextended.service;

import de.netzkronehd.itplus.dockerextended.model.ExtendedModel;
import de.netzkronehd.itplus.dockerextended.repository.ExtendedRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor(onConstructor_ = {@Autowired})
public class ExtendedService {

    private final ExtendedRepository extendedRepository;

    public ExtendedModel createModel(String name, String description) {
        final ExtendedModel extendedModel = new ExtendedModel();
        extendedModel.setName(name);
        extendedModel.setDescription(description);
        final ExtendedModel created = this.extendedRepository.save(extendedModel);
        log.info("Created model '{}'.", created);
        return created;
    }

    public List<ExtendedModel> getModels() {
        return this.extendedRepository.findAll();
    }

}
