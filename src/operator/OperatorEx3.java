package operator;

public class OperatorEx3 {
    /*
    * int 형 변수 score를 선언하세요
    * score가 80졈 이상이고, 100점 이하이면 true 출력, 아니면 false를 출력하세요
    * */
    public static void main(String[] args) {
        int score = 80;
        boolean result = score >= 80 && score <= 100;
        System.out.println("result = " + result);
    }
}
