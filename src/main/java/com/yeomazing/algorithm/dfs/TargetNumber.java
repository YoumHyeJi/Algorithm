package com.yeomazing.algorithm.dfs;

public class TargetNumber {
    /**
     *
     * @param numbers : 숫자 리스트
     * @param target : 목표 합계
     * @param index : 현재 인덱스
     * @param sum : 현재 인덱스에 위치한 숫자까지의 합계
     * @return
     */
    public int dfs(int[] numbers, int target, int index, int sum){

        if (index == numbers.length){
            if (sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }

        int cnt = dfs(numbers, target, index+1, sum+numbers[index]);
        cnt += dfs(numbers,target, index+1, sum-numbers[index]);

        return cnt;
    }

    public int solution(int[] numbers, int target) {
        int answer = dfs(numbers, target, 0, 0);
        return answer;
    }
}
