import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int Us_max;
        int Us_min;
        Us_max = Math.max(Math.max(a, b), Math.max(c, b));
        Us_min = Math.min(Math.min(a, b), Math.min(c, b));
        System.out.println(Us_max + " " + Us_min);
    }
}