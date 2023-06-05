package ex03;

public class Student {
    public static void main(String[] args) {
        int[][] scores = {
                { 100, 100, 100, 100, 100 },
                { 20, 30, 20, 40, 35 },
                { 75, 80, 90, 80, 85 }
        };

        int sum = 0;
        double avg;
        for (int i = 0; i < scores.length; i++) {
            for (int k = 0; k < scores[i].length; k++) {
                sum += scores[i][k];
            }
            avg = sum / 5;
            System.out.println(avg);
            sum = 0;
        }

        // int[][] seats = { { 0, 0, 0, 1, 1, 0, 0, 0, 0, 0 },
        // { 0, 0, 1, 1, 0, 0, 0, 0, 0, 0 },
        // { 0, 0, 0, 0, 0, 0, 1, 1, 1, 0 } };

        // int count = 0;
        // for (int i = 0; i < seats.length; i++) {
        // for (int k = 0; k < seats[i].length; k++) {
        // count += seats[i][k];
        // }
        // }
        // System.out.println("관객수 " + count);
        // }
    }
}
