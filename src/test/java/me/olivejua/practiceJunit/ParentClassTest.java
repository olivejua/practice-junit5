package me.olivejua.practiceJunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class ParentClassTest {

    @BeforeEach
    void setup() {
        System.out.println("ParentClassTest setup()");
    }

    @AfterEach
    void cleanup() {
        System.out.println("ParentClassTest cleanup()");
    }
}
