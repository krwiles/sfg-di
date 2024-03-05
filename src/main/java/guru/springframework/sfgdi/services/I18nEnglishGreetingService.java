package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishgGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService {

    private final EnglishgGreetingRepository englishgGreetingRepository;


    public I18nEnglishGreetingService(EnglishgGreetingRepository englishgGreetingRepository) {
        this.englishgGreetingRepository = englishgGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
