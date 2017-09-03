package leetcode;

import java.util.*;

/**
 * Project Name : Leetcode
 * Package Name : leetcode
 * File Name : AAA
 * Creator : Edward
 * Date : Aug, 2017
 * Description : TODO
 */
public class AAA {
    // Encodes a tree to a single string.
    public int res(int N, int K, int L) {
        long res = 1, r = 1000000007;
        for (int i = 0; i < K; i++) {
            res *= (N - i);
        }
        res *= (long)Math.pow((N-K),(L-K));
        res = res % r;
        return (int)res;
    }

    public static void main(String[] args) {
        long r = 1;
        int L = 3, N = 3, K= 3;
        int res = (int)Math.pow((N-K),(L-K));
    }
}
