package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.GreetingService;


public class SetterInjectedGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "SetterInjectedGreetingServiceImpl -> sayGreeting()";
    }
}
