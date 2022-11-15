package ss8_Refactoring;

public class TennisGame {

    public static String getScore(int scoreOfPlayer1, int scoreOfPlayer2) {

        String score = "";
        int tempScore = 0;

        if (scoreOfPlayer1 == scoreOfPlayer2) {
            score = scoreToString(scoreOfPlayer1);
        } else if (scoreOfPlayer1 >= 4 || scoreOfPlayer2 >= 4) {
            score = getAdvOrWin(scoreOfPlayer1 - scoreOfPlayer2);
        } else {
            for (int i=1; i<3; i++) {
                if (i == 1) tempScore = scoreOfPlayer1;
                else { score += "-"; tempScore = scoreOfPlayer2;}

                switch(tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    public static String getAdvOrWin(int minusResult) {
        if (minusResult == 1) return "Advantage player1";
        if (minusResult == -1) return "Advantage player2";
        if (minusResult >= 2) return "Win for player1";
        return "Win for player2";
    }

    public static String scoreToString(int score) {
        switch (score) {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";
            case 2:
                return "Thirty-All";
            case 3:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

}