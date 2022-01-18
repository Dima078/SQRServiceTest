package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"simple test, 200, 300, 3",
            "lower range limit below first square, 90, 300, 8",
            "extensive test, 1000, 20000, 68",
            "first square does not fall within the border, 80, 90, 0",
            "lower range and upper range swapped, 200, 90, 0"
    })
    public void shouldSQR(String testName, int downRande, int upRande, int expected) {
        SQRService service = new SQRService();
        int actual = service.calculateSQR(downRande, upRande);
        assertEquals(expected, actual);
    }
}