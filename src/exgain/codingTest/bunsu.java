package exgain.codingTest;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int lcm = getLeastCommonMultiple(denom1, denom2); // 두 분모의 최소공배수 계산
        int newDenom = lcm; // 새로운 분모 설정

        int newNumer1 = numer1 * (lcm / denom1); // 첫 번째 분수의 분자를 새로운 분모에 맞게 변환
        int newNumer2 = numer2 * (lcm / denom2); // 두 번째 분수의 분자를 새로운 분모에 맞게 변환

        int sumNumer = newNumer1 + newNumer2; // 두 분수의 분자를 더함
        int gcd = getGreatestCommonDivisor(sumNumer, newDenom); // 분자와 분모의 최대공약수 계산

        int[] result = { sumNumer / gcd, newDenom / gcd }; // 기약 분수로 나타냄

        return result;
    }

    // 최대공약수 계산
    private int getGreatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGreatestCommonDivisor(b, a % b);
    }

    // 최소공배수 계산
    private int getLeastCommonMultiple(int a, int b) {
        return (a * b) / getGreatestCommonDivisor(a, b);
    }

}

public class bunsu {
    public static void main(String[] args) {

    }

}
