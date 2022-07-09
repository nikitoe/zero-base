public class Sample04 {

    public void test() {

        int a = 10;
        int b = 20;

        if (a > 10) {
            // 조건이 맞을 때
            System.out.println("corrent");
        } else {
            // 조건이 안 맞을 때
            System.out.println("incorrect");
        }

        if (a > 10) {

            if (b > 10) {

            } else if (b < 10) {

            }

        } else if (a < 10) {

        } else {

        }

        int month = 4;
        int curDay = 1;

        switch (month) {
            case 1:
                curDay = 31;
                break;

            case 2:
                curDay = 28;
                break;

            case 7:
            case 8:
                curDay = 31;
                break;

            default:
                curDay = 30;
        }

    }

    public void test2() {

        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }

        int a = 10;
        while (a > 10) {

        }
    }

}
