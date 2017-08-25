import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter  extends JFrame implements ActionListener{
	private Integer count=0;
	private boolean cancel=false;
	JTextField countField= new JTextField(3);

	public static void main(String[] args) {
		new Counter();
	}
		

	public Counter(){
	
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Count:");
		countField.setText(count.toString());
		countField.setEditable(true);
		countField.setActionCommand("set");
		JButton button = new JButton("+");
		button.setEnabled(true);
		button.addActionListener(this);
		button.setActionCommand("add");
		JButton button2 = new JButton("-");
		button2.setEnabled(true);
		button2.addActionListener(this);
		button2.setActionCommand("sub");
		JButton button3 = new JButton("Reset");
		button3.addActionListener(this);
		button3.setActionCommand("reset");
		panel.add(label);
		panel.add(countField);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.setVisible(true);
		this.add(panel);
		this.setSize(300, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void increment() {
		this.count++;
		countField.setText(count.toString());
	}

	public void decrement() {
		this.count--;
		countField.setText(count.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("add")) {
			increment();
		}
		else if(e.getActionCommand().equals("sub")) {
			decrement();
		}
		else if (e.getActionCommand().equals("set")) {
			String str= this.countField.getText();
			count=Integer.parseInt(str);
		}
		else {
			count=0;
			countField.setText(count.toString());
		}
		
	}
}
