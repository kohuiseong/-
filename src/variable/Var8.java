package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,7668 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647(약 20억)

        long l = 9223372036854775807L; // 대문자 L을 붙여야 한다.

        // 실수
        // 표현범위
        // float < double double을 항상 사용 해준다
        // 실무에서는 double을 많이 쓴다. 이유는 정밀도가 훨씬 높기 때문에 오류가 적다.
        float f = 10.0f; // f를 항상 붙여줘야 한다.
        double d = 10.0;

        // 메모리를 작게 사용하면 작은 숫자를 표현 할 수 있고, 메모리를 많이 사용하면 큰 숫자를 표현 할 수 있다.
        // 변수를 선언하면 표현 범위에 따라 메모리 공간을 차지한다. 그래서 필요에 맞도록 다양한 타입을 제공한다.

        /*
        * 자주 사용하는 타입
        * 정수 - int, long : 자바는 정수에 기본으로 int를 사용한다. 만약에 20억이 넘을 것 같은 경우 long을 쓰면 된다.
        * 실수 - double : 실수는 고민 하지 말고  double을 사용한다.
        * 불린형 - boolean : true, false 참 거짓을 표현한다. 이후 조건문에서 자주 사용한다.
        * 문자열 - String : 문자를 다룰 때는 문자 하나든 문자열이든 모두 String을 사용하는 것이 편리하다.
        * */



    }
}
