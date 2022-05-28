package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.GreetingService;

public class I18nSpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
