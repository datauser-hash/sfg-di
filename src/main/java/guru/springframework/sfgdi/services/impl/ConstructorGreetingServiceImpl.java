package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "ConstructorGreetingServiceImpl -> sayGreeting()";
    }
}
