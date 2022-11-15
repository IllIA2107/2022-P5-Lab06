// Lab06vst.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06vst extends Applet
{

    public void paint(Graphics g)
    {
        // Draw Grid
        g.drawRect(10,10,780,580);
        g.drawLine(400,10,400,590);
        g.drawLine(10,300,790,300);



        // Draw Random Lines
        Random rand = new Random();
        for(int k = 0; k < 100; k++) {

            g.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));

            int x1 = rand.nextInt(391) + 10;
            int y1 = rand.nextInt(291) + 10;
            int x2 = rand.nextInt(391) + 10;
            int y2 = rand.nextInt(291) + 10;

            g.drawLine(x1,y1,x2,y2);
        }

        // Draw Random Squares
        for(int s = 0; s < 100; s++) {

            g.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));

            int x1 = rand.nextInt(341) + 400;
            int y1 = rand.nextInt(241) + 10;

            g.fillRect(x1,y1,50,50);
        }

        // Draw Random Circles
        for(int s = 0; s < 100; s++) {

            g.setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));

            int diameter = rand.nextInt(201);
            int x1 = rand.nextInt(390 - diameter) + 10;
            int y1 = rand.nextInt(290- diameter) + 300 ;

            g.drawOval(x1,y1,diameter,diameter);


        }

        // Draw 3-D Box
        g.setColor(Color.yellow);
        Polygon penta1 = new Polygon();
        penta1.addPoint(500,400);
        penta1.addPoint(600,400);
        penta1.addPoint(600,500);
        penta1.addPoint(500,500);
        g.fillPolygon(penta1);

        g.setColor(Color.green);
        Polygon penta2 = new Polygon();
        penta2.addPoint(500,400);
        penta2.addPoint(500,500);
        penta2.addPoint(550,550);
        penta2.addPoint(550,450);
        g.fillPolygon(penta2);

        g.setColor(Color.blue);
        Polygon penta3 = new Polygon();
        penta3.addPoint(600,400);
        penta3.addPoint(600,500);
        penta3.addPoint(650,550);
        penta3.addPoint(650,450);
        g.fillPolygon(penta3);

        g.setColor(Color.red);
        Polygon penta4 = new Polygon();
        penta4.addPoint(650,550);
        penta4.addPoint(650,450);
        penta4.addPoint(550,450);
        penta4.addPoint(550,550);
        g.fillPolygon(penta4);

    }

}



    
 