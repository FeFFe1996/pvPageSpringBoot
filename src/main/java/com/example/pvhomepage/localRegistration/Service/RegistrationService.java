package com.example.pvhomepage.localRegistration.Service;

import com.example.pvhomepage.localRegistration.repository.RegRepository;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private RegRepository regRepository;

    private RegMapper regMapper;

    RegistrationService(RegRepository regRepository){
        this.regRepository = regRepository;
        this.regMapper = new RegMapper();
    }


}
