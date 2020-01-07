package Threads;

import Threads.Countdown;

public class Main {

    public static void main(String[] args) {

        Countdown c1 = new Countdown("Rocket", 500);
        Countdown c2 = new Countdown("Mango", 1000);
        Countdown c3 = new Countdown("Rød", 1500);

        c1.start();
        c2.start();
        c3.start();

    }
}
