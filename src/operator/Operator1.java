package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        // 만약 b 리터럴 값을 0으로 변환 하는 경우 곱셈까지만 실행 되고 나누기 에서 예외처리가 되기 때문에 나머지 연산을 하지 않는다.
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // int는 정수형이기 때문 소수점은 표현 되지 않는다

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

        //  0을 나누는것은 수학에서 허용 되지 않으므로 예외가 발생한다.
        // int z = 10 / 0;


    }
}
