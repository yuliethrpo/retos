package com.demoqa.utils;

import com.demoqa.models.ModelInfo;
import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class GenerateData {
    private static final Faker FAKER = new Faker(new Locale("es"));

    private GenerateData() {
    }


    private static String removeSpecialChars(String text) {

        return text.replace(".", "").replace("-", "");

    }

    public static ModelInfo data() {
        return new ModelInfo(
                removeSpecialChars(FAKER.name().firstName()),
                removeSpecialChars(FAKER.name().lastName()),
                FAKER.bothify("????##@yopmail.com"),
                FAKER.bothify("##########"),
                "1997", "May", "History",
                removeSpecialChars(FAKER.address().fullAddress()), "Haryana", "Carnal");
    }
}
