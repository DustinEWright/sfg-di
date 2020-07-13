package guru.springframework.sfgdi.services;

/**
 * Created by DW 07/13/20
 */
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
