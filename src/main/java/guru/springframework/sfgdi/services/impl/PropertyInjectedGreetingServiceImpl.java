package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "PropertyInjectedGreetingServiceImpl -> sayGreeting()";
    }
}
