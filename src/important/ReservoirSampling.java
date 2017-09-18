package important;

import java.util.Random;

/**
 * Project Name : Leetcode
 * Package Name : important
 * File Name : RandomReservoir
 * Creator : Edward
 * Date : Sep, 2017
 * Description : TODO
 */
public class ReservoirSampling {
    /**
     * Reservoir Sampling
     * geeksforgeeks
     * Reservoir sampling is a family of randomized algorithms for randomly choosing k samples
     * from a list of n items, where n is either a very large or unknown number. Typically n is
     * large enough that the list doesn’t fit into main memory. For example, a list of search
     * queries in Google and Facebook.

      k  |  k < n
     1, k = n   n = 5  k = 5 res[i] = stream[i];
     2, k < i < n
        1, res 没有元素替换 : 选第k + 1 个时   k /(k + 1) |  1 - k /(k + 1) = 1 / (k + 1)
        2, 有一个元素替换 : 选第k + 1 个时   k /(k + 1)  |  res(size : k) 1 / k = 1 /(k + 1)


     time : O(n)
     space : O(k)
     * @param stream
     * @param k
     * @return
     */

    // A function to randomly select k items from stream[0..n-1].
    public static int[] reservoirSampling(int[] stream, int k) {
        Random rmd = new Random();
        int[] res = new int[k];

        for (int i = 0; i < k; i++) {
            res[i] = stream[i];
        }

        for (int i = k; i < stream.length; i++) {
            int random = rmd.nextInt(i + 1);// 0 - i
            if (random < k) {
                res[random] = stream[i];
            }
        }
        return res;
    }
}
