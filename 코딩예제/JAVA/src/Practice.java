// Practice
// 계산기 덧셈의 여러 타입 오버로딩

class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
    public Double sum(String a, String b) {
        return Double.parseDouble(a) + Double.parseDouble(b);
    }
    public Double sum(Double a, Double b) {
        return a + b;
    }

}

public class Practice {
    public static void main(String[] args) {
        // Test code
        Calculator c = new Calculator();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1.0, 2.0));
        System.out.println(c.sum("1", "2"));
        System.out.println(c.sum(1, 2, 3));
    }
}
