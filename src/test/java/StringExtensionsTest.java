import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringExtensionsTest {

    @Test
    void quersum_HappyCase() {
        String value = "12345";

        int result = StringExtensions.quersum(value);

        assertEquals(15, result);
    }

    @Test
    void reverse_HappyCase() {
        String value = "12345";

        String reversedtext = StringExtensions.reverse(value);

        assertEquals("54321", reversedtext);
    }

    @ParameterizedTest
    @CsvSource ({"0, 0", "12, 3", "0123, 6", "1000, 1" })
    void sum(String testData, int result) {
        // Act
        int actual = StringExtensions.quersum(testData);

        // Assert
        assertEquals(result, actual);
    }

}