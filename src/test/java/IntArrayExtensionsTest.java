import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayExtensionsTest {

    @Test
    void getMax_HappyCase() {
        // Arrange
        int[] testData = new int[] { 2, 1, 4, 3};

        // Act
        int actual = IntArrayExtensions.getMax(testData);

        // Assert
        assertEquals(4, actual);
    }

    @Test
    void getMin_HappyCase() {

        int[] testData = new int[] { 2, 1, 4, 3};

        int actual = IntArrayExtensions.getMin(testData);

        assertEquals(1, actual);
    }

    @Test
    void getAvarage_HappyCase() {

        int[] testData = new int[] { 2, 1, 4, 3};

        double actual = IntArrayExtensions.getAverage(testData);

        assertEquals(2.5, actual);
    }

    @Test
    void sort_HappyCase() {

        int[] testData = new int[] { 2, 1, 4, 3};

        int[] actual = IntArrayExtensions.sort(testData);

        int[] expected = new int[] { 1, 2, 3, 4 };

        assertArrayEquals( expected, actual);
    }

    @Test
    void reverse_HappyCase() {

        int[] testData = new int[] { 2, 1, 4, 3};

        int[] actual = IntArrayExtensions.reverse(testData);

        int[] expected = new int[] { 3, 4, 1, 2 };

        assertArrayEquals(expected, actual);
    }

}