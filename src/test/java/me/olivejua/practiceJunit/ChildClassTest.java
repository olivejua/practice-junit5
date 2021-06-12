package me.olivejua.practiceJunit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChildClassTest extends ParentClassTest {

    @BeforeEach
    void setup() {
        super.setup();
        System.out.println("ChildClassTest setup()");
    }

    @AfterEach
    void cleanup() {
        System.out.println("ChildClassTest cleanup()");
        super.cleanup();
    }

    @Test
    void test1() {
        System.out.println("ChildClassTest test()");
    }
}
