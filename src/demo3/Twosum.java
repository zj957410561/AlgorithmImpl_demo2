package demo3;

import edu.princeton.cs.algs4.BinarySearch;

import java.util.Arrays;

/**
 * TODO
 *
 * @author 95741
 * @version 1.0
 * @date 2020/10/15 21:14
 */
public class Twosum {
  public static int twoSums(int[] a) {
    Arrays.sort(a); // 排序
    int N = a.length;
    int cnt = 0;
    for (int i = 0; i < N; i++) {
      if (BinarySearch.rank(-a[i], a) > i) {//二分查找-a[i]是否在数组中 如果在 那就++
        // 因为排过序 要大于i  为了排除a[i] == o 的情况和重复查的情况
        cnt++;
      }
    }
    return cnt;
  }

  public static void main(String[] args) {
    //

  }
}
