import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BrowserPanel extends JPanel implements ActionListener{
	private JTextField tf;
	private JTextArea ta;
	private JPanel panel = new JPanel();;

	public BrowserPanel(){
		//BrowserFrame frame = new BrowserFrame();

		this.setLayout(new GridBagLayout());
		tf = new JTextField(35);
		tf.addActionListener(this);

		ta= new JTextArea(35,35);//allows implementation of scrolling
		ta.setEditable(true);
		JScrollPane scroll = new JScrollPane(ta);

		GridBagConstraints constraints = new GridBagConstraints();
		constraints.gridwidth = GridBagConstraints.REMAINDER;

		constraints.fill = GridBagConstraints.HORIZONTAL;
		add(tf,constraints);

		constraints.fill = GridBagConstraints.BOTH;
		constraints.weightx =1;
		constraints.weighty=1;
		add(scroll,constraints);
	}

	public void actionPerformed(ActionEvent e){
		String enteredText = tf.getText();
		System.out.println(enteredText);
		ReadWebPage webPageInfo = new ReadWebPage();
		ta.append(webPageInfo.ReadWebPage(enteredText));
		//setTitle(webPageInfo.getTitle());
		//Window window = SwingUtilities.windowForComponent(panel);
		//JFrame frame = (JFrame) window;
		//frame.setTitle("webPageInfo.getTitle()");
		//System.out.println(webPageInfo.getTitle());
		
	}
}