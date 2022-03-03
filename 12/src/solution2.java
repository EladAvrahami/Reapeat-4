public class solution2 {

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

    class Solution {

        public int calc(int num) {
            if (num == 0) {
                return 0;
            }
            return num + calc(num - 1);
        }

        public int calc2(int num) {
            int res = 0;
            for (int i = num; i>0; i--)  {
                res += i;
            }
            return res;
        }

// This is O(n^2)
        // public int solution(int N) {
        //     // write your code in Java SE 8
        //     int k = 0;
        //     int res;
        //     if (N>0){
        //         for (int i = 1; i<=N; i++) {
        //             res = calc2(i);
        //             if (res > N) {
        //                 return i - 1;
        //             }
        //         }

        //     }
        //     return k;
        // }

        public int solution(int N) {
            // write your code in Java SE 8
            int sol = 0;
            int res;
            for (int i = 0; i<N; i++) {
                int sumN = (i * (i + 1) / 2);
                if (sumN <= N) {
                    sol = i;
                } else {
                    break;
                }
            }
            return sol;


        }

    }

}
