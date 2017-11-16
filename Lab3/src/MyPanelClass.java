import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width +1, height +1);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, height / 5, width + 1, height / 5);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, height * 3 / 5, width + 1, height / 5);
                        
                        
                        
                       
                        //Draw a border
                        g.setColor(Color.BLACK);
                        g.drawRect(x1, y1, width, height);
//                       
                        //Draw a second border
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1 + 3, y1 + 3, width - 5, height - 5);
//                        
                        //Draw a diagonal line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                       
                        //Draw a second diagonal line
//                        g.setColor(Color.BLACK);
//                        g.drawLine(x1, y2, x2, y1);
                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(((getWidth() -55) / 2), ((getHeight() -55) / 2), 55, 55);
////                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                         Polygon p3 = new Polygon ();
                         p3.addPoint(x1, y1);
                         p3.addPoint(x1, y1 + height);
                         p3.addPoint(width / 2, height / 2);
                         g.setColor(Color.BLUE);
                         g.fillPolygon(p3);
                       
                         int posX = 10;
                         int posY = 35;
                         Polygon p2 = new Polygon();
                         p2.addPoint(x1 + 45 - 45 + posX, y1 + 93 - 78 + posY);
                         p2.addPoint(x1 + 61 - 45 + posX, y1 + 93- 78 + posY);
                         p2.addPoint(x1 + 67- 45 + posX, y1 + 78- 78 + posY);
                         p2.addPoint(x1 + 73- 45 + posX, y1 + 93- 78 + posY);
                         p2.addPoint(x1 + 89- 45 + posX, y1 + 93- 78 + posY);
                         p2.addPoint(x1 + 76- 45 + posX, y1 + 103- 78 + posY);
                         p2.addPoint(x1 + 81- 45 + posX, y1 + 118- 78 + posY);
                         p2.addPoint(x1 + 67- 45 + posX, y1 + 108- 78 + posY);
                         p2.addPoint(x1 + 54- 45 + posX, y1 + 118- 78 + posY);
                         p2.addPoint(x1 + 58- 45 + posX, y1 + 103- 78 + posY);
                         g.setColor(Color.WHITE);
                         g.fillPolygon(p2);
                        
                        
                        
            }
}