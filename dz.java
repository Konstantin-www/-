package DZ_1;

public class dz {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2, 3, 4));
        System.out.println(task10and20(5, 7));
        isPositiveOrNegative(-7);
        doFive("преподаватель");
        doSix(2021);
    }

        public static int calculate(int a, int b, int c, int d) {
            System.out.println("\nЗадание 1.");
            return a * (b + (c / d));

        }

        static boolean task10and20(int a, int b) {
            System.out.println("\nЗадание 2.");
            int sum = a + b;
            if (sum > 10 && sum < 20) return true;
            else return false;
        }

        static void isPositiveOrNegative(int a) {
            System.out.println("\nЗадание 3.");
            if (a >= 0){
                System.out.println("Число " + a + "положительное");
            } else {
                System.out.println("Число " + a + " отрицательное");
            }
        }

        public static void doFive(String name) {
                System.out.println("\nЗадание 4.");
                System.out.println("Привет, " + name + "!");
        }

        public static void doSix(int year) {
                System.out.println("\nЗадание 5.");
                if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
            else System.out.println(year + " г. високосный");
            }
}






























