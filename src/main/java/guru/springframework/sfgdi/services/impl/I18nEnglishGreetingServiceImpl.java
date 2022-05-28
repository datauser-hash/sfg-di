package guru.springframework.sfgdi.services.impl;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.services.GreetingService;


public class I18nEnglishGreetingServiceImpl implements GreetingService {

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingServiceImpl(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }


    @Override
    public String sayGreeting() {
        return this.englishGreetingRepository.sayGreeting();
    }
}
