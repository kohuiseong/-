package cond;

public class If2 {
    public static void main(String[] args) {
        int age = 20;

        if(age >= 18) {
            // 조건이 참이 될 경우 if 명령어 실행
            System.out.println("성인 입니다.");
        } else {
            // 만족하는 조건이 없는 경우 else문 실행
            System.out.println("미성년자 입니다.");
        }
    }
}
