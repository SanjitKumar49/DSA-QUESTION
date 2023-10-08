import java.applet.Applet;
import java.awt.Color;
import java.awt.*;

public class LabelButton extends Applet {
    public void init(){
        setBackground(Color.BLACK);
        setForeground(Color.white);
        Label l=new Label("welcome");
        add(l);
        l.getText();
        Button b=new Button();
        add(b);
       // b.setLabel("click");
    } public void paint(Graphics g){
        g.drawString("hii sanjit",400,400);
    }
    
   
    
}
