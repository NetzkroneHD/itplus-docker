package de.netzkronehd.itplus.dockerextended.repository;

import de.netzkronehd.itplus.dockerextended.model.ExtendedModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExtendedRepository extends JpaRepository<ExtendedModel, Integer> {

}
