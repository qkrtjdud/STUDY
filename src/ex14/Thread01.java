package ex14;

public class Thread01 {
    // CPU가 하나의 스레드를 생성하며 실행한다.
    // 실 == main메서드
    public static void main(String[] args) {

        new Thread(() -> { // 타겟(스레드의 길이)
            for (int i = 0; i < 5; i++) {
                System.out.println("서브 스레드: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("메인 스레드: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
