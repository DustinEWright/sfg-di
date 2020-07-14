package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by DW 07/14/20
 */
@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
