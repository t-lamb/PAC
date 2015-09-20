import javax.swing.JOptionPane; //import from API, becomes part of the symbol table

public class Hello {
	
	public static void main(String args[]) {
		//showMessageDialog(Component parentComponent, Object message)
		//brings up an info-message dialog title "message"
		JOptionPane.showMessageDialog( null, "Hello\nWorld" );
		System.exit(0);
	}//end method main
}