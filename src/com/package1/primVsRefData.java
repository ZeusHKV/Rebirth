package com.package1;

import java.awt.*;

public class primVsRefData {
    public static void main(String[] args) {
        //Primitive Data Types
//        byte x = 1;
//        byte y = x;
//        x+=2;
//        System.out.println("X : "+x );
//        System.out.println("Y : "+y );

        //Ref. Data Types
        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x+=2;
        System.out.println("Point 1: "+point1);
        System.out.println("Point 2: "+point2);
    }
}
