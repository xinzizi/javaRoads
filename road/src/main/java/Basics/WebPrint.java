package Basics;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by pc on 2017/6/2.
 */
public class WebPrint extends Applet {
    int x,y;
    public void start(){
        Graphics g = getGraphics();
        for (x=0;x<=750;x+=1){
            g.drawString(".",x,200);
            if(x<=385) g.drawString(".",360,x);
        }
        g.drawString("Y",330,20);
        for (x=360;x<=370;x+=1)
        {
            g.drawString(".",x-10,375-x);
            g.drawString(".",x,x-355);
        }
        g.drawString("X",735,230);
        for(x=740;x<=750;x+=1)
        {
            g.drawString(".",x,x-550);
            g.drawString(".",x,x-355);
        }
        g.drawString("X",735,230);
        for(x=740;x<=750;x+=1)
        {
            g.drawString(".",x,x-550);
            g.drawString(".",x,950-x);
        }
        for(x=0;x<=720;x+=1)
        {
            double a=Math.cos(x*Math.PI/180+Math.PI);
            y=(int)(200+80*a);
            g.drawString(".",x,y);
        }
    }
}
