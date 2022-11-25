package info;

import java.util.Arrays;

public class OneDimensiona {
    static Integer x = 5;
    static int xx[] = new int[OneDimensiona.x];

    public static void xxx(int length) {
        if (xx.length > 1) {
            for (int i = 0; i < xx.length; i++) {
                xx[i] = x -= 2;
            }
            System.out.println(Arrays.toString(xx));
        }
    }
}
