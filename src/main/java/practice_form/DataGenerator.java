package practice_form;

import com.github.javafaker.Faker;

public class DataGenerator {

    Faker faker = new Faker();

    public String generateFakeFirstName() {
        return faker.name().firstName();
    }
}