public class Sandbox {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int case1 = x <= 10 ? x : y;
        int case2 = x == y ? x : y;
        int case3 = x > y ? x : y;
        int case4 = x < y ? x : y;

        System.out.println(case1);
        System.out.println(case2);
        System.out.println(case3);
        System.out.println(case4);

    }
}
