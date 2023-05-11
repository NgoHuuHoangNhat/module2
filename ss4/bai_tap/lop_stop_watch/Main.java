package ss4.bai_tap.lop_stop_watch;

import ss4.bai_tap.lop_fan.Fan;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();



        System.out.print("Nhập 1 để bắt đầu: ");
        int start = Integer.parseInt(scanner.nextLine());

        if(start == 1){
            stopWatch.start();
            System.out.println("bắt đầu: " + stopWatch.getStartTime());
        }

        System.out.print("Nhập 2 để kết thúc: ");
        int stop = Integer.parseInt(scanner.nextLine());

        if(stop == 2){
            stopWatch.stop();
            System.out.println("kết thúc: " + stopWatch.getEndTime());
            System.out.println("Thời gian(milisecond): " +stopWatch.getElapsedTime());
        }

    }
}
