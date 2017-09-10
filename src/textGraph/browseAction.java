package textGraph;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class browseAction implements ActionListener{
	public void actionPerformed(ActionEvent event) {
		if(event.getSource().equals(window.browseFile)) {
			/**
			 * create a file chooser
			 */
			JFileChooser selector = new JFileChooser();
			selector.setDialogTitle("Please choose the file...");
			FileNameExtensionFilter filter = new FileNameExtensionFilter("text file(*.txt)", "txt");
			selector.setFileFilter(filter);
			int returnVal = selector.showOpenDialog(null);
			/**
			 * set the text in the text field using the path
			 */
			if(returnVal == JFileChooser.APPROVE_OPTION) {
				String filePath = selector.getSelectedFile().getPath();
				window.fileLocation.setText(filePath);
			}
		}
	}

}
