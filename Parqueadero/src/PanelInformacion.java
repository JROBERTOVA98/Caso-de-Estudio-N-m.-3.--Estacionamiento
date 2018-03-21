import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelInformacion extends JPanel
{
	private PanelPrincipal Principal;
	
	//Atributos
	private JLabel ValorEnCaja;
	private JTextField valorCaja;
	private JLabel PuestosVacios;
	private JTextField puestos;
	
	
	
	
	public PanelInformacion(PanelPrincipal v)
	{
		Principal=v;
		setLayout(new GridLayout(2,3));
		setPreferredSize(new Dimension(0,65));
		
		
		TitledBorder border = BorderFactory.createTitledBorder("Informacion");
		border.setTitleColor(Color.BLUE);
		setBorder(border);
		
		ValorEnCaja = new JLabel("Valor en caja");
		valorCaja = new JTextField("$ 0");
		
		PuestosVacios = new JLabel("Puestos vaciops");
		puestos = new JTextField(": ");
		
	
		
		valorCaja.setEditable(false);
		valorCaja.setForeground(Color.BLUE);
		valorCaja.setBackground(Color.WHITE);
		
		puestos.setEditable(false);
		puestos.setForeground(Color.BLUE);
		puestos.setBackground(Color.WHITE);
		
		//add(new JLabel(""));
		//add(new JLabel(""));
		//add(butLimpiar);
		add(ValorEnCaja);
		add(valorCaja);
		//add(butCalcular);
		add(puestos);
		add(PuestosVacios);
		
		
	}
	
	

}