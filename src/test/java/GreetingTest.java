import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingTest {

    String name = "Bob";

    @Test
    void testReq1() {

        Greeting greeting = new Greeting();
        String expected = "Hello, Bob";
        String received = greeting.greet("Bob");
        assertEquals(expected,received);

    }

    @Test
    void testReq2() {

        Greeting greeting = new Greeting();
        String expected = "Hello, my friend";
        String received = greeting.greet(null);
        assertEquals(expected, received);
    }

    @Test
    void testReq3() {

        Greeting greeting = new Greeting();
        String expected = "HELLO, JERRY!";
        String recieved = greeting.greet("JERRY");
        assertEquals(expected, recieved);
    }

    @Test
    void testReq4() {

        Greeting greeting = new Greeting();
        String expected = "Hello, Jill and Jane.";
        String receivedNames = greeting.greet("Jill","Jane");
        assertEquals(expected, receivedNames);
    }


    @Test
    void testReq5() {

        Greeting greeting = new Greeting();
        String expected = "Hello, Amy, Brian, and Charlotte.";
        String received = greeting.greet("Amy", "Brian", "Charlotte");
        assertEquals(expected, received);
    }

}
