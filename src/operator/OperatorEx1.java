package operator;

public class OperatorEx1 {
    /*
    * 문제1
    * num1, num2, num3 라는 이름의 세 개의 int 변수를 선언하고 각각 10, 20 ,30 으로 초기화 하세요
    * 세 변수의 합을 계산하고 그 결과 sum 이라는 이름의 int 변수를 저장하세요
    * sum 과 average 변수의 값을 출력하세요
    * */

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);

        int average = sum / 3;
        System.out.println("average = " + average);
    }
}
