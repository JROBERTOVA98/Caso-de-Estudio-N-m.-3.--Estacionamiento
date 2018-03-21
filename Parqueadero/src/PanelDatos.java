import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel
{
	private PanelPrincipal principal;
	//Atributos
	private JLabel lblHora;
	private JTextField txtHora;
	private JButton btnIngresar;
	private JButton btnSalir;
	private JButton btnAvanzar;	
	private JButton btnOpcion1;
	private JButton btnOpcion2;
	
	public PanelDatos(PanelPrincipal Pp){
		principal = Pp;
		setLayout(new GridLayout(2,3));
		
		TitledBorder borde = BorderFactory.createTitledBorder("Ingrese Hora:");
		borde.setTitleColor(Color.BLUE);
		setBorder(borde);
		
		lblHora = new JLabel("Hora actual: ");
		txtHora = new JTextField(": ");
		btnIngresar = new JButton ("Ingresar");
		btnSalir = new JButton ("Salir");
	    btnAvanzar = new JButton ("Avanzar");
		btnOpcion1 = new JButton ("Opcion 1");
		btnOpcion2 = new JButton ("Opcion 2");
		
		txtHora.setEditable(true);
		txtHora.setForeground(Color.BLUE);
		txtHora.setBackground(Color.WHITE);
		
		
		add(new JLabel(""));add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));add(new JLabel(""));
		add(lblHora);
		add(txtHora);
		add(new JLabel(""));	
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		
		add(btnIngresar);
		add(new JLabel(""));
		add(btnAvanzar);
		add(new JLabel(""));
		add(btnSalir);
		add(new JLabel(""));
		add(btnOpcion1);
		add(new JLabel(""));
		add(btnOpcion2);
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		
	}
	
	
	{
		
		
		
		
		
		
		
		
		

		

		
		
		
	}

	
}