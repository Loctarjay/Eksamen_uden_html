package Threads;

import java.util.Random;

public class Countdown extends Thread {

    private String name;
    private int speed;
    private int luck;
    Random r1;

    public Countdown(String name, int speed) {
        this.r1 = new Random();
        this.name = name;
        this.speed = speed;
    }

    public void run() {
        for (int i = 3; i >= 0; i--) {
            if (i == 0) {
                System.out.println("GOOOOO!");
                for (int j = 20; j > 0; j--) {
                    this.luck = r1.nextInt(5) + 1;
                    if (luck == 2) {
                        System.out.println(name + " got lucky!!!!");
                        speed -= 100;
                    }
                    System.out.println(name + " " + j);
                    try {
                        Thread.sleep(speed);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(name + " is done!\t Speed: " + speed + "\tLuck: " + luck);
            } else {
                System.out.println("Countdown: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
