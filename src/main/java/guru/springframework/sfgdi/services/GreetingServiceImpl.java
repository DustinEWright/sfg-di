package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created by DW 07/13/20
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
