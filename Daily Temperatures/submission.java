class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       int[] answer = new int[temperatures.length];
       Stack<Integer> temp = new Stack<Integer>();

       for(int i=0; i<temperatures.length; i++){
          int currDay = temperatures[i];

          while(!temp.isEmpty() && currDay>temperatures[temp.peek()]){
            int prevDay = temp.pop();
            answer[prevDay] = i-prevDay; 
          }

          temp.push(i);
       }

       return answer;
    }
}
