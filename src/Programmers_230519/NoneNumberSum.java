package Programmers_230519;
//없는 숫자 더하기
/*0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.*/

public class NoneNumberSum {
    public static int solution(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return 45 - sum;
    }
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9,};
        System.out.println(solution(numbers));
        System.out.println(solution(numbers2));
    }
}