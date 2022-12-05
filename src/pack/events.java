package pack;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class events extends JFrame implements ActionListener,MouseListener,KeyListener,ItemListener,ListSelectionListener,MouseMotionListener{
	    JPanel pan = new JPanel();
	    JButton entrer = new JButton("Entrer");
	    JButton afficher = new JButton("Afficher");
	    JButton next1 = new JButton("NEXT");
	    JButton next2 = new JButton("NEXT");
	    JButton next3 = new JButton("NEXT");
	    JButton next4 = new JButton("NEXT");
	    JButton next5 = new JButton("NEXT");
	    JButton next6 = new JButton("NEXT");
	    JButton next7 = new JButton("NEXT");
	    JButton restart = new JButton("RESTART");
	    JButton selection = new JButton("Afficher selection");
	    JTextField txt = new JTextField(25);
	    JLabel lab = new JLabel("This is a testing label");
	    JLabel warning = new JLabel("Control is reserved for Exit");
	    JLabel typed = new JLabel("Key typed: ");
	    JLabel pressed = new JLabel("Key pressed: ");
	    JLabel released = new JLabel("Key released: "); 
	    JLabel question = new JLabel("Where do you come from ? "); 
	    JComboBox cities = new JComboBox();
	    String [] options = new String []{"Tunis","Sousse","Kairouan","Bizerte","Gabes","Ariana","Gafsa","Mounastir","Ben Arous","Kasserine","Medenine","Nabeul","Tataouine","Beja","Kef","Mehdia","Sidi Bouzid","Tozeur","Manouba","Siliana","Zaghouan","Kebili"};
	    JList citiesTun = new JList(options);
	    List citiesSelected = new ArrayList();
	    JLabel dragged = new JLabel("Your mouse is currently being dragged");
	    JLabel moved = new JLabel("Your mouse is currently being moved");
	    DefaultListModel<Object> model = new DefaultListModel<>();
	    JList<Object> listVals = new JList<>(model);
	events(){
		this.setTitle("events test");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		exercice1_2();
	}
	
public void actionPerformed(ActionEvent event) {
		Object source;
		source=event.getSource();
		if (source == entrer) {
			JOptionPane.showMessageDialog(null,txt.getText());
		}
        if (source == afficher) {
        	JOptionPane.showMessageDialog(null,"Appui sur le bouton afficher");
		}
        if (source == selection) {
        	JOptionPane.showMessageDialog(null,txt.getSelectedText());
		}
        if (source == restart) {
        	lab.setForeground(Color.red);
           
		}
        if (source == next1) {
        	exercice3();
		}
        if (source == next2) {
        	exercice4();
			}
        if (source == next3) {
        	exercice5();
			}
        if (source == next4) {
        	exercice6();
			}
        if (source == next5) {
        	exercice7();
			}
        if (source == next6) {
        	exercice8();
			}
        if (source == next7) {
        	exercice9();
			}
}
        
		

void exercice1_2(){
	this.add(pan);
	pan.add(txt);
	pan.add(entrer);
	pan.add(afficher);
	pan.add(next1);
	entrer.addActionListener(this);
	afficher.addActionListener(this);
	next1.addActionListener(this);
	this.setBounds(200, 200, 350, 150);
	this.setVisible(true);
}
void exercice3(){
	pan.remove(next1);
	pan.add(selection);
	pan.add(next2);
	selection.addActionListener(this);
	next2.addActionListener(this);
	this.setBounds(200, 200, 350, 150);
	this.setVisible(true);
	
}
void exercice4(){
	pan.remove(txt);
	pan.remove(entrer);
	pan.remove(afficher);
	pan.remove(selection);
	pan.remove(next2);
	lab.setFont(new Font("Arial",Font.BOLD,50));
	lab.setForeground(Color.red);
	lab.addMouseListener(this);
	pan.add(lab);
	pan.add(restart);
	pan.add(next3);
	next3.addActionListener(this);
	restart.addActionListener(this);
	this.setBounds(200, 200,600,150);
	this.setVisible(true);
}
void exercice5(){
	this.remove(pan);
	this.setLayout(new FlowLayout());
	txt = new JTextField(20);
	this.add(warning);
    this.add(txt);
    pan.removeAll();
    pan.setLayout(new GridLayout(3,1,2,2));
    this.add(pan);
    pan.add(typed);
    pan.add(pressed);
    pan.add(released);
    txt.addKeyListener(this);
    this.setBounds(200, 200, 300, 200);
    this.add(next4);
    next4.addActionListener(this);
	this.setVisible(true);
}
void exercice6() {
	this.remove(warning);
	this.remove(txt);
	this.remove(next4);
	pan.removeAll();
	question.setFont(new Font("Arial",Font.BOLD,25));
	cities.setPreferredSize(new Dimension(100,50));
	pan.add(question);
	pan.add(cities);
	this.add(pan);
	cities.addItem("Tunis");
    cities.addItem("Sfax");
    cities.addItem("Sousse");
    cities.addItem("Kairouan");
    cities.addItem("Bizerte");
    cities.addItem("Gabes");
    cities.addItem("Ariana");
    cities.addItem("Gafsa");
    cities.addItem("Monastir");
    cities.addItem("Ben Arous");
    cities.addItem("Kasserine");
    cities.addItem("Medenine");
    cities.addItem("Nabeul");
    cities.addItem("Tataouine");
    cities.addItem("Beja");
    cities.addItem("Kef");
    cities.addItem("Mehdia");
    cities.addItem("Sidi Bouzid");
    cities.addItem("Tozeur");
    cities.addItem("Menouba");
    cities.addItem("Siliana");
    cities.addItem("Zaghouan");
    cities.addItem("Kebili");
    cities.addItemListener(this);
    this.add(next5);
    next5.addActionListener(this);
    this.setBounds(200, 200, 400, 250);
    this.setVisible(true);
}

void exercice7(){
	this.remove(next5);
	pan.removeAll();
	pan.setLayout(new FlowLayout());
	citiesTun.addListSelectionListener(this);
	next6.addActionListener(this);
	pan.add(citiesTun);
	pan.add(listVals);
	pan.add(next6);
	citiesTun.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	this.setBounds(0, 0, 1380, 600);
	this.setVisible(true);
}
void exercice8(){
	pan.removeAll();
	this.add(next7);
	this.addMouseMotionListener(this);
	next7.addActionListener(this);
	dragged.setFont(new Font("Arial",Font.BOLD,50));
	moved.setFont(new Font("Arial",Font.BOLD,50));
	this.setBounds(200, 200,980,150);;
	this.setVisible(true);
}

void exercice9(){
	this.remove(next7);
	this.remove(pan);
	pan.removeAll();
	this.removeMouseMotionListener(this);
	pan.add(txt);
	pan.add(entrer);
	pan.add(afficher);
	pan.add(selection);
	this.add(pan);
	txt.removeKeyListener(this);
	txt.setText("");
	focusHandler handler = new focusHandler();
	txt.addFocusListener(handler);
	this.setBounds(200, 200, 700, 100);
	this.setVisible(true);
	this.setVisible(true);
}

public void mouseClicked(MouseEvent e) {
	int x =pan.getLocationOnScreen().x;
	int y =pan.getLocationOnScreen().y;
	JOptionPane.showMessageDialog(null, "Action clic souris ("+e.getX()+","+e.getY()+")");
	//lorsque mousePressed et mouseReleased sont d�finis,mouseClicked n'est pas d�clench�!!
}

public void mousePressed(MouseEvent e) {
	JOptionPane.showMessageDialog(null, "Action appui souris ("+e.getX()+","+e.getY()+")");
}

public void mouseReleased(MouseEvent e) {
	JOptionPane.showMessageDialog(null, "Action relacher souris("+e.getX()+","+e.getY()+")");	
}

public void mouseEntered(MouseEvent e) {
	 lab.setForeground(Color.blue);
}

public void mouseExited(MouseEvent e) {
	 lab.setForeground(Color.green);
}

public void keyTyped(KeyEvent e) {	
	pan.remove(typed);
	pan.remove(pressed);
	pan.remove(released);
	typed = new JLabel ("Key typed:  " + e.getKeyChar()+" -- Doesn't show code");
	typed.setFont(new Font("Tahoma",Font.BOLD,15));
	pressed.setFont(new Font("Tahoma",Font.BOLD,12));
	released.setFont(new Font("Tahoma",Font.BOLD,12));
	typed.setForeground(Color.red);
	pressed.setForeground(Color.black);
	released.setForeground(Color.black);
	pan.add(typed);
	pan.add(pressed);
	pan.add(released);
	this.setVisible(true);
}

public void keyPressed(KeyEvent e) {
	if (e.getKeyCode() == KeyEvent.VK_CONTROL)
		  System.exit(0);
	pan.remove(typed);
	pan.remove(pressed);
	pan.remove(released);
	pressed = new JLabel ("Key pressed: " + e.getKeyChar() +" -- Key code : " + e.getKeyCode()+" ");
	typed.setFont(new Font("Tahoma",Font.BOLD,12));
	pressed.setFont(new Font("Tahoma",Font.BOLD,15));
	released.setFont(new Font("Tahoma",Font.BOLD,12));
	typed.setForeground(Color.black);
	pressed.setForeground(Color.BLUE);
	released.setForeground(Color.black);
	pan.add(typed);
	pan.add(pressed);
	pan.add(released);
	this.setVisible(true);    
}

public void keyReleased(KeyEvent e) {
	pan.remove(typed);
	pan.remove(pressed);
	pan.remove(released);
	released = new JLabel ("Key released : " + e.getKeyChar() +" -- Key code : " + e.getKeyCode()+" ");
	typed.setFont(new Font("Tahoma",Font.BOLD,12));
	pressed.setFont(new Font("Tahoma",Font.BOLD,12));
	released.setFont(new Font("Tahoma",Font.BOLD,15));
	typed.setForeground(Color.black);
	pressed.setForeground(Color.black);
	released.setForeground(Color.GREEN);
	pan.add(typed);
	pan.add(pressed);
	pan.add(released);
	this.setVisible(true);
}

public void itemStateChanged(ItemEvent e) {
	Object obj = e.getItem();
	String str = obj.toString();
	if (e.getStateChange() == ItemEvent.SELECTED)
		JOptionPane.showMessageDialog(null,str +" has been selected ");
     else
        JOptionPane.showMessageDialog(null,str +" is no longer selected ");
}

public void valueChanged(ListSelectionEvent e) {
	citiesSelected = citiesTun.getSelectedValuesList();
    citiesSelected.sort(Comparator.naturalOrder());
    model.removeElement(citiesSelected);
    model.addElement(citiesSelected);
    pan.remove(next6);
    pan.add(listVals);
    pan.add(next6);
}

public void mouseDragged(MouseEvent e) {
	pan.remove(moved);
	pan.add(dragged);
	this.setVisible(true);
}

public void mouseMoved(MouseEvent e) {
	pan.remove(dragged);
	pan.add(moved);
	this.setVisible(true);
}

private class focusHandler implements FocusListener{

	public void focusGained(FocusEvent e) {	
		txt.setBackground(Color.red);
	    txt.setText("Focus gained");
	}

	public void focusLost(FocusEvent e) {
		txt.setBackground(Color.gray);
	    txt.setText("Focus lost");
	}
}

public static void main(String[] args) {
	events frame = new events();
}
}