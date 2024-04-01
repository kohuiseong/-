package cond;

public class If5 {

    /*
    * 예시1 if - else 사용 : 서로 연관된 조건이어서 하나로 묶을때
    * if(조건1) {
    *   작업 1 수행
    * } else if (조건2) {
    *   작업 2 수행
    * }
    *
    * 예시2 if 각각 사용 : 독립 조건 일때
    * if (조건1) {
    *   작업 1 수행
    * } else if (조건2) {
    *   작업 2 수행
    * }
    *
    * 예시1은 작업 1, 작업 2 둘중 하나만 수행된다. 그런데 예시2 는 조건만 맞다면 둘다 수행 될 수 있다.
    * */
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if(price >= 10000) {
            discount = discount +1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        }

        if(age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        }

        System.out.println("총 할인 금액 : " + discount + "원");
    }
}
