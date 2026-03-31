package com.example.pvhomepage.localRegistration;

import org.springframework.data.repository.ListCrudRepository;

public interface RegRepository extends ListCrudRepository<Registration, Long> {
    Registration getRegistrationByTeamLeader(String teamLeader);

}
