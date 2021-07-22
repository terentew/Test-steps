package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class Jenkinstest {

    @BeforeAll

    static void setup() {
        Configuration.startMaximized = true;
    }
}
