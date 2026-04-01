package com.example.pvhomepage.localRegistration.Controller;

import com.example.pvhomepage.localRegistration.Service.RegistrationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistrationController {
    private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);
    RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService){
        this.registrationService = registrationService;
    }

    @GetMapping("/bokning")
    public String registrationPage(){
        return "bokning";
    }
}
