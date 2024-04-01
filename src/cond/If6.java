package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >= 10000) {
            discount = discount +1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if(age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }
        else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액 : " + discount + "원");

        // if 문 코드가 한줄인 경우 중괄호 생략가능 하지만 권장하지는 않는다.
        // 프로그래밍 스타일에 따라 다르긴 하지만 일반적으로 if 문의 명령이 한개만 있을경우에도 다음과 같은 이유로 중괄호를 사용하는 것이 좋다.
        if(true)
            System.out.println("if문 실행");

    }
    // else if 는 if문 조건이 참이면 else if 문은 실행 되지 않는다.
    // 정리하면 10000원 이상이므로 1000원만 할인이 된다.
}
