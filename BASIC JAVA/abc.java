import java.applet.*;
import java.awt.*;
/* 
<applet code="abc" width="300" height="300">
</applet>
 */

public class abc extends Applet {

    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.BLUE);

    }

    public void paint(Graphics g) {
        g.drawString("hello", 100, 100);

    }
}
