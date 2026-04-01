package com.example.pvhomepage.localRegistration.repository;

import com.example.pvhomepage.localRegistration.model.Registration;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegRepository extends ListCrudRepository<Registration, Long> {
    Registration getRegistrationByTeamLeader(String teamLeader);

}
