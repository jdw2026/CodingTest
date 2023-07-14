class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {0,0};
        for(int item : num_list){
            if(item %2 == 0) answer[0]++;
            else answer[1]++;
        }
        return answer;
    }
}