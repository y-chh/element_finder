package findTwoNonRepeat;

// Group related test cases using '@RunWith(Parameterized.class)'. if you have multiple scenarios that share the same setup but expect different results.

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

@RunWith(Parameterized.class)
public class FindTwoNonRepeatingParameterizedTest {

    private final int[] input;
    private final int[] expectedResult;

    // constructor to initialize 'input' and 'expectedResult' variables for each individual TCs. This constructor can be called with different values for 'input' and 'expectedResult'
    // for each test case defined in the data method.
    public FindTwoNonRepeatingParameterizedTest(int[] input, int[] expectedResult) {
        this.input = input;
        this.expectedResult = expectedResult;
    }

    /**
     * @Parameters: is used to specify the data for the parameterized test. This annotation indicates that the 'data' method will provide the input values and expected
     * output values for each test case.
     * In this case, we will define five test cases/edge cases with varying input arrays and their expected results.
     * @return: Collection of arrays, where each array contains input values followed by expected output values for a single test case.
     */
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
       return Arrays.asList(new Object[][] {
               {new int[] {1,2,3,1,2,4} , new int[] {3,4}},
               {new int[] {}, new int[] {}},
               {new int[] {1}, new int[] {}},
               {new int[] {3,2}, new int[] {3,2}},
               {new int[] {1,2,3,1,2,3}, new int[] {}}
       }) ;
    }

    /**
     * This method is the actual test method that runs for each test case defined in the 'data' method.
     * For each test case , it calls the 'FindTwoNonRepeating.findTwoNonRepeating(input)' method to obtain actual result.
     */
    @Test
    public void testFindTwoNonRepeating() {
      int[] actualResult = FindTwoNonRepeating.findTwoNonRepeating(input);
      assertArrayEquals(expectedResult, actualResult);
    }



















}
