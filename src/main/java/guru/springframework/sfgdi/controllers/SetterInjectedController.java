package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by DW 07/13/20
 */
public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
