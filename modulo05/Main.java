import javax.swing.*;
public class Main {
	public static void main(String[] args){
		MySimpleGUI gui = new MySimpleGUI();
	}
}
class MySimpleGUI extends JFrame{
	public MySimpleGUI(){
		setSize(400,200);
		setTitle("ventana 01 (tipo JFrame)");
		setVisible(true);
	}
}