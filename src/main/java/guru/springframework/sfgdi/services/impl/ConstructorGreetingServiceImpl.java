package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "ConstructorGreetingServiceImpl -> sayGreeting()";
    }
}
