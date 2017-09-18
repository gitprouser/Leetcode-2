import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Project Name : Leetcode
 * Package Name : PACKAGE_NAME
 * File Name : Main
 * Creator : Edward
 * Date : Aug, 2017
 * Description : TODO
 */
public class Main {



    public static void main(String[] args) {
        String s = "sdfsfsfsd0dfdasdfsdf123sdfsd-1-5fasfsd-10dfdfsdfdsf345fzffdgdfd";
        int k = 3;
        char[] c = s.toCharArray();
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i <= c.length; i++) {
            if (i < c.length && c[i] >= '0' && c[i] <= '9') {
                StringBuilder sb = new StringBuilder();
                if (i > 0 && c[i - 1] == '-') {
                    sb.append(c[i - 1]);
                }
                while (i < c.length && c[i] >= '0' && c[i] <= '9') {
                    sb.append(c[i++]);
                }
                list.add(Integer.parseInt(sb.toString()));
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i < k; i++) {
            result.add(list.get(i));
        }
        System.out.println(result);
    }
}
