import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {
    public void massiv() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите какого размера массив вы хотите создать в формате \"X Y\" где X первичный массив, а Y вторичный");
        int u = scanner.nextInt();
        int r = scanner.nextInt();
        System.out.println("Вы создали массив с размерами " +"["+u+"]"+"["+r+"]");
        Data[][] q = new Data[u][r];
        System.out.println("Введи данные в формате \"x x x\"");
        scanner.nextLine();
        for (int i = 0; i < q.length; i++) {
            for (int j = 0; j < q[i].length; j++) {
                String t = scanner.nextLine();
                String[] tt = t.split(" ");
                int height = Integer.parseInt(tt[0]);
                int weight = Integer.parseInt(tt[1]);
                int years = Integer.parseInt(tt[2]);
                q[i][j] = new Data(height, weight, years);
                System.out.println(Arrays.deepToString(q));
            }
        }
    }
}
