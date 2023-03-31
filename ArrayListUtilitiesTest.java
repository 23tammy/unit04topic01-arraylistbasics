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
        expectedOutput = 
        actualOutput = ArrayListUtilities.withoutLongWords(input);



    }
}
