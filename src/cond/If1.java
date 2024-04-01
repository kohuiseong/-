package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20; // 사용자 나이

        if (age >= 18) {
            // 참일 경우 if 문 아래에 있는 문장이 실행 된다.
            System.out.println("성인 입니다");
        }

        if(age < 18) { // false 가 되기 때문에 실행 되지 않는다.
            System.out.println("미성년자 입니다.");
        }
    }
}
