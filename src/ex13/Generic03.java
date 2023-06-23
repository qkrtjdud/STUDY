package ex13;

class Data<T> {
    int status; // 200
    T body; // 값
}

public class Generic03 {

    Data<?> getNum(int check) { // <?> 와일드 카드라고 한다.
        if (check == 1) {
            Data<String> data = new Data<>();
            return data;
        } else {
            Data<Integer> data = new Data<>();
            return data;
        }
    }

    Object getNum2(int check) {
        if (check == 1) {
            return "안녕";
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

    }
}
