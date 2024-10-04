package test;

import main.HelloMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloMessageTest {
    HelloMessage helloMessage;

    static void setUpBeforeClass() throws Exception {
        System.out.println("HelloMessageTest.setUpBeforeClass");
    }

    static void tearDownAfterClass() throws Exception {
        System.out.println("HelloMessageTest.tearDownAfterClass");
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("HelloMessageTest.setUp");
        helloMessage = new HelloMessage();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("HelloMessageTest.tearDown");
        helloMessage = null;
    }

    @org.junit.jupiter.api.Test
    void getMessage() {
        System.out.println("HelloMessageTest.getMessage");
        assertEquals("Hello JUnit 5", helloMessage.getMessage());
    }

    @org.junit.jupiter.api.Test
    void getMessage2(){
        System.out.println("HelloMessageTest.getMessage2");
        assertTrue("Hello JUnit 5".equals(helloMessage.getMessage()));
    }
}