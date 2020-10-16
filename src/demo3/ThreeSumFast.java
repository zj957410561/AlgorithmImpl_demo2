package demo3;

import edu.princeton.cs.algs4.BinarySearch;

import java.util.Arrays;

/**
 * TODO
 *
 * @author 95741
 * @version 1.0
 * @date 2020/10/15 21:25
 */
public class ThreeSumFast {
  public static int ThreeSum(int[] a) {
    int N = a.length;
    int cnt = 0;
    Arrays.sort(a);
    for (int i = 0; i < N; i++) {
      for (int j = i; j < N; j++) {
        if (BinarySearch.rank(-a[i] - a[j], a) > j) cnt++;
      }
      //
    }
    return cnt;
  }

  public static void main(String[] args) {
    //
  }
}
