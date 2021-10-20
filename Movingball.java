import java.awt.*;
import java.applet.*;
public class Movingball extends Applet implements Runnable
{
    int x,y,dx,dy;
    Thread t;
    boolean flag;
    public void init()
    {
        setBackground(Color.blue);
        x=100;
        y=10;
        dx=10;
        dy=10;
    }
    public void start()
    {
        flag=true;
        t=new Thread(this);
        t.start();
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(x,y,50,50);
    }
    public void run()
    {
        while(flag)
        {
            Rectangle r=getBounds();
            if((x+dx<=0)||(x+dx>=r.width))
                dx=-dx;
            if((y+dy<=0)||(y+dy>=r.height))
                dy=-dy;
            x+=dx;
            y+=dy;
            repaint();
            try
            {
                Thread.sleep(300);
            }
            catch(InterruptedException e)
            {}
        }
    }   
    public void stop()
    {
        t=null;
        flag=false;
    }
}

/* 
<applet code="Movingball.class" width="100" height="700"> 
</applet> 
*/  