import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1.Сумма от 1 до N Ввод: одно целое N (N ≥ 1). Вывести: сумму 1 + 2 + … + N.
        Scanner sc = new Scanner(System.in);
     /* System.out.println("Введите число");
        int N = sc.nextInt();
        if (N < 0) {
        System.err.println("Некорректное значение");
        System.exit (0);
        }
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum += i;
        }
        System.out.println("Итоговая сумма " + sum);
        }*/
        //2. Сумма квадратов нечётных ≤ N Ввод: N. Вывести: 1² + 3² + 5² + ... ≤ N.
/*        System.out.println("Введите число");
        int N = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i+= 2) {
            sum += Math.pow(i, 2);
        }
        System.out.println("Итоговая сумма " + sum);
    }*/
        //3.Факториал N (0 ≤ N ≤ 20) Ввод: N. Вывести: N!.
/*        System.out.println("Введите число");
        int N = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= N ; i++) {
            factorial *= i;
        }
        System.out.println(N + "!= " + factorial);
    }*/
        //4. Среднее арифметическое N чисел Ввод: N, затем N целых. Вывести: среднее с точностью, например, до 3 знаков.
/*        System.out.println("Введите число");
        int N = sc.nextInt();
        int sum = 0;
        int i;
        for (i = 1; i <= N ; i++) {
            System.out.println("Введите " + i + " число");
            int n = sc.nextInt();
            sum += n;
        }
            System.out.println("Среднее арифметическое " + sum / N);
        }*/
        // 5. Подсчёт положительных из N вводимых Ввод: N, затем N целых. Вывести: сколько из них > 0.
        int N = sc.nextInt();
        int plus = 0;
        for (int i = 0; i <= N; i++) {
            int number = sc.nextInt();
        if (number > 0) {
            plus++;
        }
        }
        System.out.println("Всего положительных = " + plus);
    }
}