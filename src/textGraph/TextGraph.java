package textGraph;
import javax.swing.*;
import java.awt.*;
import textGraph.browseAction;
import textGraph.allFunction;
class TextGraph{
	private JFrame mainFrame;
	private JLabel label1;
	private JLabel label2;
	public static JTextField fileLocation;
	public static JTextField targetLocation;
	public static JButton browseFile;
	public static JButton browseTarget;
	public static JButton createGraph;
	/**
	 * Launch the application;
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextGraph window = new TextGraph();
					window.mainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application;
	 */
	public TextGraph() {
		initialize();
	}
	/**
	 * initialize the contents of the frame;
	 */
	private void initialize() {
		
		mainFrame = new JFrame("Textfile-Graph Convertor");
		Container container = mainFrame.getContentPane();
		mainFrame.setSize(1000, 600);
		mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mainFrame.setLocationRelativeTo(null);
		mainFrame.setResizable(false);
		container.setLayout(null);
		
		label1 = new JLabel("Please enter or choose the path of the file:");
		label1.setBounds(50, 270, 750, 30);
		container.add(label1);
		
		label2 = new JLabel("Please enter or choose the path you want to save some generated files:");
		label2.setBounds(50, 330, 750, 30);
		container.add(label2);
		
		fileLocation = new JTextField();
		fileLocation.setBounds(50, 300, 750, 30);
		container.add(fileLocation);
		
		targetLocation = new JTextField();
		targetLocation.setBounds(50, 360, 750, 30);
		container.add(targetLocation);
		
		browseFile = new JButton("Select...");
		browseFile.setBounds(810, 300, 150, 30);
		browseFile.addActionListener(new browseAction());
		container.add(browseFile);
		
		browseTarget = new JButton("Select...");
		browseTarget.setBounds(810, 360, 150, 30);
		browseTarget.addActionListener(new browseAction());
		container.add(browseTarget);
		
		createGraph = new JButton("Create Graph");
		createGraph.setBounds(400, 420, 200, 50);
		createGraph.addActionListener(new allFunction());
		container.add(createGraph);
		
	}
	
}
