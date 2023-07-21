class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = 0;
        int score2 = 0;
        for(int i=0; i<player1.length; i++){
            if(i == 0){
                score1 += player1[i];
            }
            else if( i == 1 && player1[i-1] == 10){
                score1 += 2*player1[i];
            }
            else if(i>=2 && (player1[i-1] == 10 || player1[i-2] == 10)){
                score1 += 2*player1[i];
            }
            else{
                score1 += player1[i];
            }
        }

        for(int i=0; i<player2.length; i++){
            if(i == 0){
                score2 += player2[i];
            }
            else if( i == 1 && player2[i-1] == 10){
                score2 += 2*player2[i];
            }
            else if(i>=2 && (player2[i-1] == 10 || player2[i-2] == 10)){
                score2 += 2*player2[i];
            }
            else{
                score2 += player2[i];
            }
        }

        if(score1 > score2){
            return 1;
        }
        else if(score1 < score2){
            return 2;
        }
        else{
            return 0;
        }
    }
}
