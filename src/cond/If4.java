package cond;

public class If4 {
    /*
    * if (조건1) {
    *   조건1이 참일 때 실행 되는 코드
    * } else if (조건2) {
    *   조건1이 거짓이고, 조건2가 참일 경우
    * } else if (조건3) {
    *   조건2가 거짓이고, 조건3이 참 일때
    * } else {
    *   조건1,2,3 모두가 거짓일 때 실행되는 코드
    * }
    * */

    public static void main(String[] args) {
        int age = 14;
        if(age <= 7) { // false
            System.out.println("미취학 아동");
        } else if(age <=13) { // true
            System.out.println("초등학생");
        } else if(age <= 16) {
            System.out.println("중학생");
        } else if(age <=19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }
    }
}
