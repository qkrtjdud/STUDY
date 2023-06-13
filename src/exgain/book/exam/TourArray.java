package exgain.book.exam;

import java.util.ArrayList;

public class TourArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("홍콩");
        list.add("미국");
        list.add("러시아");
        list.add("일본");

        System.out.println("여행지 추천");
        int index = (int) (Math.random() * list.size());
        System.out.println("추천 여행지는 " + list.get(index));
    }

}
