class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        Arrays.sort(tokens);
        int Maxscore = 0;
        int first = 0, last = tokens.length-1;

        while(first<=last){
            if(power >= tokens[first]){
                score++;
                power -= tokens[first];
                first++;
                Maxscore = Math.max(score, Maxscore);
            }
            else if(first<last && score>0){
                power += tokens[last];
                last--;
                score--;
                Maxscore = Math.max(score, Maxscore);
            }
            else{
                return Maxscore;
            }
        }

        return Maxscore;
    }
}
