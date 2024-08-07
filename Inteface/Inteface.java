// package Interface;

import java.util.*;

interface Moveable {

    int AVG_SPEED = 40;

    void move();
}

class Vehicle implements Moveable {

    public void move() {

        System.out.println("Average speed is " + AVG_SPEED);
    }
}

public class Inteface {

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.move();
    }
}
