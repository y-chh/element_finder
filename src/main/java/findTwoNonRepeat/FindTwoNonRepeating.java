package findTwoNonRepeat;

import java.util.HashMap;
import java.util.Map;

public class FindTwoNonRepeating {
    public static int[] findTwoNonRepeating(int[] input) {
        if(input == null || input.length < 2) {
            return new int[0];
        } else if (input.length == 2 && input[0] != input[1]) {
            return input;
        }else {
            Map<Integer, Integer> elementFrequencyMap = new HashMap<>();
            for(int num : input) {
                if(elementFrequencyMap.containsKey(num)) {
                    elementFrequencyMap.put(num, elementFrequencyMap.get(num) + 1);
                }else {
                    elementFrequencyMap.put(num, 1);
                }
            }
            int[] result = new int[2];
            int resultIndex = 0;
            for(int num : input) {
                if(elementFrequencyMap.get(num) == 1) {
                    result[resultIndex++] = num;
                    if(resultIndex == 2){
                        break;
                    }
                }
            }
            if(resultIndex != 2) {
                return new int[0];
            }
            return result;
        }
    }
}
