package findTwoNonRepeat;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindTwoNonRepeatingTest {

    // Step 1: The first step in TDD is to write a test case that captures the expected behavior of the function
    @Test
    public void testFindTwoNonRepeating() {
        int[] inputs = {1,2,3,1,2,4};
        int[] expectedResult = {3,4};

        int[] actualResult = FindTwoNonRepeating.findTwoNonRepeating(inputs); // This line will fail, since there's no FindTwoNonRepeating class created nor the method
        assertArrayEquals(expectedResult,actualResult);
    }

    // Step 5: Checking edge cases
    @Test
    public void testFindTwoNonRepeatingEmptyArray() {
        int[] input = {};
        int[] expected = {};

        int[] result = FindTwoNonRepeating.findTwoNonRepeating(input);
        assertArrayEquals(expected,result);
    }

    // Step 6: When element is less than two
    @Test
    public void testFindTwoNonRepeatingElementLessThanTwo() {
        int[] input = {1};
        int[] expected = {};

        int[] result = FindTwoNonRepeating.findTwoNonRepeating(input);
        assertArrayEquals(expected,result);
    }

    // EC 3: When element are two distinct values, return the value
    @Test
    public void testFindTwoNonRepeatingWithTwoDistinctInput() {
        int[] input = {3,2};
        int[] expected = {3,2};

        int[] result = FindTwoNonRepeating.findTwoNonRepeating(input);
        assertArrayEquals(expected,result);
    }

    // EC 4: When all elements are repeating
    @Test
    public void testAllElementsRepeating() {
        int[] input = {1,2,3,1,2,3};
        int[] expected = {};

        int[] actualResult = FindTwoNonRepeating.findTwoNonRepeating(input);
        assertArrayEquals(expected,actualResult);

    }

}


















