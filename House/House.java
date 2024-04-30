import java.awt.*;
import java.awt.event.*;
public class House extends Frame implements MouseListener{
Color d = new Color(0,0,255);
public House(){
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
	System.exit(0);
	}
	});
	addMouseListener(this);
	}
	
	
public void paint(Graphics g){
Color f = new Color(157,157,157);
Color w = new Color(254,251,243);
Color b = new Color(0,0,0);
Color r = new Color(121,180,183);
Color wood = new Color(204,155,109);
Color bg = new Color(242,218,195);

//roof
g.setColor(r);
int x[] ={350,950,640};
int y[] ={300,300,100};
g.fillPolygon(x ,y ,3);

//wall
g.setColor(w);
g.fillRect(430,300,420,300);


//foundation
g.setColor(f);
g.fillRect(430,600,420,50);

//door
g.setColor(d);
g.fillRect(587,400,105,200);



//window left
g.setColor(bg);
g.fillRect(476,400,65,125);
g.setColor(wood);
g.drawRect(476,400,65,125);
g.drawLine(508,400,508,525);
g.drawLine(476,441,541,441);
g.drawLine(476,482,541,482);


//window right
g.setColor(bg);
g.fillRect(738,400,65,125);
g.setColor(wood);
g.drawRect(738,400,65,125);
g.drawLine(770,400,770,525);
g.drawLine(738,441,803,441);
g.drawLine(738,482,803,482);

//steps
g.setColor(bg);
g.fillRect(567,600,145,25);
g.fillRect(547,625,185,25);
g.setColor(wood);
g.drawRect(567,600,145,25);
g.drawRect(547,625,185,25);


}
public void mouseClicked(MouseEvent e){
d = new Color(255,0,0);
repaint();
}
public void mousePressed(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseReleased(MouseEvent e){}
public static void main(String[] args){
House houseWin =new House();

houseWin.setSize(1280,720);
houseWin.setTitle("House");
houseWin.setVisible(true);
}
}














