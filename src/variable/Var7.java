package variable;

import org.w3c.dom.ls.LSOutput;

public class Var7 {
    /*
    * 리터럴
    * 변수를 초기화하느 값을 의미 한다.
    * 100, 10.5, true, 'A', "hello java"
    * 고정된 값을 프로그래밍 용어로 리터럴 이라고 한다.
    * 변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.
    * */
    public static void main(String[] args) {
        int a = 100; // 정수
        double b = 10.5; // 실수
        boolean c = true; // true, false 입력 가능
        char d = 'A'; // 문자 하나, char 타입은 작은따옴표만 사용해서 감싸야 한다. 'A'
        String e = "hello java"; // 문자열, 문자열을 다루기 위한 특별한 타입, 큰 따옴표로 감싸야 한다.

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
