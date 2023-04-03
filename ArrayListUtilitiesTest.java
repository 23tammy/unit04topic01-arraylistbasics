import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class ArrayListUtilitiesTest {
    @Test
    public void testGetListMax() {
        ArrayList<Integer> input;
        int expectedOutput;
        int actualOutput;

        // some positive numbers
        input = new ArrayList<>(Arrays.asList(1, 5, 4, 9, 2, 1));
        expectedOutput = 9;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6 ,7, 8, 11));
        expectedOutput = 11;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList(1000, 10101010));
        expectedOutput = 10101010;
        actualOutput = ArrayListUtilities.getListMax(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void withoutLongWords(){
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;
        
        input = new ArrayList<>(Arrays.asList("coshsad", "adsfsf", "ad"));
        expectedOutput = new ArrayList<>(Arrays.asList("ad"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList("chicken", "fart", "bruh", "ziggy"));
        expectedOutput = new ArrayList<>(Arrays.asList("fart", "bruh", "ziggy"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList("coshasdfsdfdsf", "adsfs", "ad"));
        expectedOutput = new ArrayList<>(Arrays.asList("adsfs", "ad"));
        actualOutput = ArrayListUtilities.withoutLongWords(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void removeLongWords(){
        ArrayList<String> input;
        ArrayList<String> expectedOutput;
        ArrayList<String> actualOutput;
        
        input = new ArrayList<>(Arrays.asList("coshsad", "adsfsf", "ad"));
        ArrayListUtilities.removeLongWords(input);
        expectedOutput = new ArrayList<>(Arrays.asList("ad"));
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList("chicken", "fart", "bruh", "ziggy"));
        ArrayListUtilities.removeLongWords(input);
        expectedOutput = new ArrayList<>(Arrays.asList("fart", "bruh", "ziggy"));
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList("coshasdfsdfdsf", "adsfs", "ad"));
        ArrayListUtilities.removeLongWords(input);
        expectedOutput = new ArrayList<>(Arrays.asList("adsfs", "ad"));
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void reversed() {
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;

        input = new ArrayList<>(Arrays.asList(1.0, 5.0, 4.0, 9.0, 2.0, 1.0));
        expectedOutput =  new ArrayList<>(Arrays.asList(1.0, 2.0, 9.0, 4.0, 5.0, 1.0));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0 ,7.0, 8.0, 11.0));
        expectedOutput = new ArrayList<>(Arrays.asList(11.0,8.0,7.0,6.0,5.0,4.0,3.0,2.0,1.0));
        actualOutput = ArrayListUtilities.reversed(input);
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList(1000.0, 10101010.0));
        expectedOutput = new ArrayList<>(Arrays.asList(10101010.0,1000.0));
        actualOutput = ArrayListUtilities.reversed(input);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void reverseInPlace() {
        ArrayList<Double> input;
        ArrayList<Double> expectedOutput;
        ArrayList<Double> actualOutput;

        input = new ArrayList<>(Arrays.asList(1.0, 5.0, 4.0, 9.0, 2.0, 1.0));
        ArrayListUtilities.reverseInPlace(input);
        expectedOutput =  new ArrayList<>(Arrays.asList(1.0, 2.0, 9.0, 4.0, 5.0, 1.0));
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0 ,7.0, 8.0, 11.0));
        ArrayListUtilities.reverseInPlace(input);
        expectedOutput = new ArrayList<>(Arrays.asList(11.0,8.0,7.0,6.0,5.0,4.0,3.0,2.0,1.0));
        actualOutput = input;
        assertEquals(expectedOutput, actualOutput);

        input = new ArrayList<>(Arrays.asList(1000.0, 10101010.0));
        ArrayListUtilities.reverseInPlace(input);
        expectedOutput = new ArrayList<>(Arrays.asList(10101010.0,1000.0));
        actualOutput = input;

        assertEquals(expectedOutput, actualOutput);
    }
}
