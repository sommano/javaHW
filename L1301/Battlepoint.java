package com.java24hours;

import java.awt.*;
import java.util.*;

public class Battlepoint {
    ArrayList<Point> targets = new ArrayList<Point>();

    public Battlepoint {
        //create targets to shoot at 
        createTargets();
        //display the game map
        showMap();
        //shoot at three points
        shoot(7,4);
        shoot(3,3);
        shoot(9,2);
        //display the map again
        showMap();
    }
    private void showMap() {
        System.out.println("\n 1 2 3 4 5 6 7 8 9");
        for (int row = 1; column < 10; column++) {
            for (int row = 1; row < 10;)
        }
    }
}