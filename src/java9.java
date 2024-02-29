public class java9 {
    public static void main(String[] args) {
        char ch = 'Z';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("해당 문자는 영문 소문자입니다.");
        }
        else {
            System.out.println("해당 문자는 영문 소문자가 아닙니다.");
        }
        int score = 70;

        if (score >= 90) {
            System.out.println("학점 90 이상입니다.");
        }
        else if (score >= 80) {
            System.out.println("학점 80 이상입니다.");
        }
        else if (score >= 70) {
            System.out.println("학점 70 이상입니다.");
        }
        else if (score >= 60) {
            System.out.println("학점 60 이상입니다.");
        }
        else if (score >= 50) {
            System.out.println("학점 50 이상입니다.");
        }
        else if (score >= 40) {
            System.out.println("학점 40 이상입니다.");
        }
    }
}
