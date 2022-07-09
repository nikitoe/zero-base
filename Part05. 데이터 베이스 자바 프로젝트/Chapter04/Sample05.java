public class Sample05 {

    public static void main(String[] args) {

        System.out.println("!!!");

        for (int j = 1; j <= 9; j++) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d", i, j, (j * i));
                System.out.print("\t");
            }
            System.out.println();
        }

    }

}
