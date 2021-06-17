package temaHotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JFrame;


public class Hotel2 extends JFrame {
	
	
public Hotel2(){
super("draw");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setSize(1000,800);
setVisible(true);
}

public void paint(Graphics g) {
super.paint(g);
g.setColor(Color.GREEN);
g.fillRect(0, 560, 1000, 560);

g.setColor(Color.blue);
g.fillRect(0, -70, 2000, 650);




int xCo[]= {50,350,200};
int yCo[]= {300,300,50};
int n=xCo.length;
g.setColor(Color.red);
g.drawPolygon(xCo,yCo,n);
g.fillPolygon(xCo, yCo, n);
g.setColor(Color.white);
g.fillRect(50, 300, 300, 300);
g.setColor(Color.yellow);
g.fillOval(70, 320, 70, 70);
g.fillOval(260, 320, 70, 70);
g.setColor(Color.red);
g.fillRect(250, 95, 20, 90);


;

g.fillRect(70, 410, 70, 70);
g.fillRect(260, 410, 70, 70);
g.setColor(Color.darkGray);
g.fillRect(170, 500, 70, 100);
g.fillRect(400, 500, 20, 100);
g.setColor(Color.green);
g.fillOval(375, 460, 70, 70);
g.setColor(Color.gray);
g.fillRect(480, 400, 10, 200);
g.setColor(Color.green);
g.fillOval(460, 350, 50, 120);
g.setColor(Color.gray);
g.fillRect(650, 400, 10, 200);
g.setColor(Color.green);
g.fillOval(630, 350, 50, 120);
g.setColor(Color.gray);
g.fillRect(550, 500, 20, 100);
g.setColor(Color.green);
g.fillOval(525, 460, 70, 90);
g.setColor(Color.BLACK);
g.setFont(new Font("Monospaced", Font.PLAIN, 23));
g.drawString("Diana Plătică", 120, 245);



}
public static void main(String[] args) {
// TODO Auto-generated method stub
Hotel2 hotel = new Hotel2();

}

}