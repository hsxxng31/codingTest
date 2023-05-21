package Programmers_230519;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

//약수의 개수와 덧셈
/*
두 정수 left와 right가 매개변수로 주어집니다.
left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
*/
public class Factor {
    public static int solution(int left, int right){
        int sum = 0;

        for(int i = left; i <= right; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count ++;
                }
            }
            if(count  % 2 == 0){
                sum += i;
            }
            else sum -= i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(solution(13,17));
        System.out.println(solution(24,27));
    }
}
