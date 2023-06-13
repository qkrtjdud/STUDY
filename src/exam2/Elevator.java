package exam2;

public class Elevator {
    public static void main(String[] args) {
        // 변수 생성
        int a = 13;
        int b = 7;
        int c = 21;

        // 결과 출력
        System.out.printf("%d층 -> %s 엘레베이터\n", a, guide(a));
        System.out.printf("%d층 -> %s 엘레베이터\n", b, guide(b));
        System.out.printf("%d층 -> %s 엘레베이터\n", c, guide(c));
    }

    public static String guide(int s) {
        // 1.유효성 검사(필터)
        if (s > 20 || s < 1)
            return "오류";

        // 2.리턴값 초기화
        String result = "";

        // 3.알고리즘
        if (s <= 10)
            result = "저층";
        else if (s >= 11 || s <= 20)
            result = "고층";

        return result;
    }

}
