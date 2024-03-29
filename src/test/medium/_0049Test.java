package test.medium;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import main.medium._0049.Solution;

public class _0049Test {
    @Test
    public void initTest() {
        final var soln = new Solution();
        String[][] dataset = new String[][] {
                { "bat" }, { "nat", "tan" }, { "ate", "eat", "tea" }
        };

        List<List<String>> expectedList = new ArrayList<>();
        for (var arr : dataset) {
            expectedList.add(Arrays.asList(arr));
        }

        var gotList = soln.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
        // TODO: Testing 2D Lists: Order agnostic even in Sub Lists

        // Base Line Cases Pass -> Order Agnostic on 1d Arrays
        expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList(new String[] { "" }));

        gotList = soln.groupAnagrams(new String[] { "" });

        assertTrue(expectedList.size() == gotList.size());
        assertTrue(expectedList.containsAll(gotList));
        assertTrue(gotList.containsAll(expectedList));

        expectedList = new ArrayList<>();
        expectedList.add(Arrays.asList(new String[] { "a" }));

        gotList = soln.groupAnagrams(new String[] { "a" });

        assertTrue(expectedList.size() == gotList.size());
        assertTrue(expectedList.containsAll(gotList));
        assertTrue(gotList.containsAll(expectedList));

    }

}
