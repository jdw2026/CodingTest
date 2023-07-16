class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for(int i=0; i<numLog.length; i++){
            if(i+1==numLog.length) break;
            int num = numLog[i]-numLog[i+1];
            switch(num){
                case -1 : answer += "w"; break;
                case 1 : answer += "s"; break;
                case -10 : answer += "d"; break;
                case 10 : answer += "a"; break;
            }   
        }
        return answer;
    }
}