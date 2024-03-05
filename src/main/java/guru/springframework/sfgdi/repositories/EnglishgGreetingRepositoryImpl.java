package guru.springframework.sfgdi.repositories;

public class EnglishgGreetingRepositoryImpl implements EnglishgGreetingRepository {
    @Override
    public String getGreeting() {
        return "Hello World - EN";
    }
}
