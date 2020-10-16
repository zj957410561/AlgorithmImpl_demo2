package Chapter1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
    static int a[]=new int[10];
    /**
     * 1.1.3编写一个程序，从命令行得到三个整数参数。如果他们都相等就打印equal 否则打印not equal
     */
    @Test
    public void Test113() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x == y && x == z) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    /**
     * 1.1.11 打印二维数组的内容
     */
    @Test
    public void Test1111() {
        boolean temp = true;
        boolean[][] a = new boolean[5][5];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = temp;
                temp = !temp;
            }
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print("[");
            for (int j = 0; j < a[i].length; j++) {
                if (j == 0 && a[i][j] == true) {
                    System.out.print("*");
                } else if (j == 0 && a[i][j] == false)
                    System.out.print("#");
                else if (a[i][j] == true) {
                    System.out.print(",*");
                } else
                    System.out.print(",#");
            }
            if (i == a.length - 1) {
                System.out.print("]");
            } else
                System.out.print("],");
        }
        System.out.print("]");
        //System.out.println(Arrays.deepToString(a));
    }

    /**
     * 1.15
     */
    @Test
    public void Test115() {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a >= 0 && a <= 1 && b >= 0 && b <= 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public void Test119() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        String s = "";
        for (int n = x; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
    }

    /**
     * 1.1.13 打印出一个M行N列的二维数组的倒置
     */
    @Test
    public void Test1113() {
        int b = 1;
        int M = 4;
        int N = 4;
        int[][] a = new int[M][N];
        int[][] d = new int[M][N];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = b;
                b++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                d[i][j] = a[j][i];
            }

        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(d));
    }

    /**
     * 不用Math中的api返回不大于LogM(N)的最大整数
     * @param N
     * @param M
     */
    @Test
    public void Test1114(int N, int M) {
        int a = 0;
        while (N >= M) {
            N = N / M;
            a++;
        }
        System.out.println(a);
    }

    public static void main(String args[]){

        System.out.println(a[10 ]);
        Demo1 demo1 = new Demo1();
        demo1.Test119();

    }
}
