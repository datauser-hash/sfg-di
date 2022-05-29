package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.impl.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.impl.*;
import org.springframework.context.annotation.*;

@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile("EN")
    @Bean
    I18nEnglishGreetingServiceImpl i18nService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingServiceImpl(englishGreetingRepository);
    }

    @Profile({"ES", "default"})
    @Bean("i18nService")
    I18nSpanishGreetingServiceImpl i18nSpanishGreetingService() {
        return new I18nSpanishGreetingServiceImpl();
    }

    @Primary
    @Bean
    PrimaryGreetingServiceImpl primaryGreetingServiceImpl() {
        return new PrimaryGreetingServiceImpl();
    }

    // ConstructorGreetingServiceImpl bean is now configured in sfgdi-config.xml file

    @Bean
    PropertyInjectedGreetingServiceImpl propertyInjectedGreetingServiceImpl() {
        return new PropertyInjectedGreetingServiceImpl();
    }

    @Bean
    SetterInjectedGreetingServiceImpl setterInjectedGreetingServiceImpl() {
        return new SetterInjectedGreetingServiceImpl();
    }
}
