import java.awt.*;
import javax.swing.*;
//Roberto
public class PanelPrincipal extends JFrame
{
	
	
	private PanelParqueadero panelEspacios;
	private PanelDatos panelDatos;
	private PanelInformacion panelInformacion;
	
	
	public PanelPrincipal() throws Exception
	{
	
		setTitle( "Calculo impuestos");
		setSize(950,400);
		setResizable(true);
		setDefaultCloseOperation( EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		panelEspacios = new PanelParqueadero(null);
		add(panelEspacios,BorderLayout.NORTH);
		
		panelDatos = new PanelDatos(null);
		add(panelDatos,BorderLayout.CENTER);
		
		panelInformacion = new PanelInformacion(null);
		add(panelInformacion,BorderLayout.SOUTH);
	}

	//Programa Principal
	public static void main (String[] args) throws Exception
	{
	
		PanelPrincipal Vent = new PanelPrincipal();
		Vent.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Vent.setVisible(true);
	}
	
	
	

}
