class Solution {
    public int solution(int[] numbers) {
        int max = 0;
        int max2 = 0;
        int index = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
              max = numbers[i];
              index = i;  
            } 
        }
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max2 && max>=numbers[i] && index!=i) max2 = numbers[i];
        }
        
        return max*max2;
    }
}