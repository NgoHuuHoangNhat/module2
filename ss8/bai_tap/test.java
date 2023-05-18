package ss8.bai_tap;

import ss8.bai_tap.TennisGame;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("nhập tên người chơi 1: ");
        String firstPlayerName = scanner.nextLine();

        System.out.print("nhập tên người chơi 1: ");
        String secondPlayerName = scanner.nextLine();



        while (true) {
            System.out.print("nhập điểm của " + firstPlayerName + ": ");
            int firstPlayerScore = Integer.parseInt(scanner.nextLine());

            System.out.print("nhập điểm của " + secondPlayerName + ": ");
            int secondPlayerScore = Integer.parseInt(scanner.nextLine());

            if (firstPlayerScore >= 0 && secondPlayerScore >= 0) {
                if (firstPlayerScore == secondPlayerScore) {
                    System.out.println(TennisGame.getScoreEqual(firstPlayerScore));
                } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
                    System.out.println(TennisGame.getScoreAfterDeuce(firstPlayerName, secondPlayerName, firstPlayerScore, secondPlayerScore));
                } else {
                    System.out.println(TennisGame.getScoreBeforeDeuce(firstPlayerScore, secondPlayerScore));
                }
            }
        }
    }
}
