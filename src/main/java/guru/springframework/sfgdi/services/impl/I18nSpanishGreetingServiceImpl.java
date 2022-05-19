package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile({"ES", "default"}) can be set as a default profile and remove spring.profiles.active from property file
@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
