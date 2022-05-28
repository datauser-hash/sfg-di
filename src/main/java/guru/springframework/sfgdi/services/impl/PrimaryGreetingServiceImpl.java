package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.GreetingService;


public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {

        return  "PrimaryGreetingService -> sayGreeting()";
    }
}
