import java.util.HashSet;
import java.util.Set;

public class Solution {
   /* public int solution(int[] A) {
        // write your code in Java SE 8

        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }

        int max = A[0];

        for (int i = 0; i <= A.length; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        for (int i = 1; i <= max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }


    }*/
}
