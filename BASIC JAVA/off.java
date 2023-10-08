import java.awt.*;
import java.applet.Applet;
/* 
<applet code="off" width="300" height="300">
</applet>
 */

public class off extends Applet {
        
    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.BLUE);

    }
    public void paint(Graphics g) {
        g.drawString("hello",100,100);

   }
}
