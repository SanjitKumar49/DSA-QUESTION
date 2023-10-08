import java.awt.*;
import java.applet.*;

public class project extends Applet {
   public void init(){
    setBackground(Color.black);
    setForeground(Color.yellow);

  }
  public void paint(Graphics g){
    g.drawString("Welcome sanjit",300,300);
    g.drawLine(50,50,20,30);
    g.drawRect(40, 40,70,30);
    g.fillRect(40,40 ,30, 30);
    g.drawOval(70, 90, 40, 50);
    g.fillOval(70, 90, 40, 50);

    
  }
}