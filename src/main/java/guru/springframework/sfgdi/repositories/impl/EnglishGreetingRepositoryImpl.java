package guru.springframework.sfgdi.repositories.impl;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    /**
     * @return String
     */
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
