package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

/**
 * Created by DW 07/13/20
 */
public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
