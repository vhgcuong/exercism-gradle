package basic.exercism.helloworld;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {
    
    @Test
    @DisplayName("Say Hi!")
    public void testThatGreeterReturnsTheCorrectGreating() {
        final String greetString = new Greeter().getGreeting();
        assertThat(greetString)
            .isEqualTo("Hello, World!");
    }
}
