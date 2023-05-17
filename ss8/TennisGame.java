package ss8;


public class TennisGame {
    /**
     * @creator: Ngo Huu Hoang Nhat
     * ---------
     * Clean Code
     * Tách method
     * Đưa các biến ra ngoài và đổi thành biển static(mục đích: chỉ cần khai báo 1 lần)
     * Đổi tên các biến: player1 => firstPlayerName
     * Đổi tên các biến: player2 => secondPlayerName
     * Đổi tên các biến: m_player1 => firstPlayerScore
     * Đổi tên các biến: m_player2 => secondPlayerScore
     * Thêm dấu ngoặc nhọn "{ }" ở các câu lệnh điều kiện
     *
     */
    static String score = "";
    static int tempScore;

    public static String getScoreEqual(int firstPlayerScore) {

        switch (firstPlayerScore) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }

        return score;
    }

    public static String getScoreAfterDeuce(String firstPlayerName, String secondPlayerNam, int firstPlayerScore, int secondPlayerScore) {
        int minusResult = firstPlayerScore - secondPlayerScore;

        if (minusResult == 1) {
            score = "Advantage: " + firstPlayerName;
        } else if (minusResult == -1) {
            score = "Advantage: " + secondPlayerNam;
        } else if (minusResult >= 2) {
            score = "Win for: " + firstPlayerName;
        } else {
            score = "Win for: " + secondPlayerNam;
        }
        return score;
    }

    public static String getScoreBeforeDeuce(int firstPlayerScore, int secondPlayerScore) {

        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = firstPlayerScore;
            } else {
                score += "-";
                tempScore = secondPlayerScore;
            }

            switch (tempScore) {
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
                    score += "Forty";
                    break;
            }
        }
        return score;
    }
}
