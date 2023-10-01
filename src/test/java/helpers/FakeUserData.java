package helpers;

import com.github.javafaker.Faker;

public class FakeUserData {

    static Faker faker = new Faker();

    public static String FIRST_NAME = faker.name().firstName();

    public static String LAST_NAME = faker.name().lastName();

    public static String POST_CODE = faker.address().zipCode();
}
