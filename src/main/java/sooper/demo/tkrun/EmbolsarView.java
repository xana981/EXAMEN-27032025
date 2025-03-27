package sooper.demo.tkrun;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Dimension;
import java.awt.Font;

public class EmbolsarView {

	protected JFrame frmEmbolsar;
	private JTable tablaEmbolsar;
	private DefaultTableModel modeloEmbolsar;
	
	public EmbolsarView() {
		initialize();
	} 

	private void initialize() {

		modeloEmbolsar = new DefaultTableModel(new Object[][] {
		},
		new String[] {
				"idArticulo", "idContenedor"
			});
		
		frmEmbolsar = new JFrame();
		frmEmbolsar.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmEmbolsar.getContentPane().setLayout(new MigLayout("", "[grow]", "[][grow][]"));
		frmEmbolsar.setBounds(0,0,400,500);
		
		JScrollPane scrollPaneEmbolsar = new JScrollPane();
		frmEmbolsar.getContentPane().add(scrollPaneEmbolsar, "cell 0 1,grow");
		
		tablaEmbolsar = new JTable();
		tablaEmbolsar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		tablaEmbolsar.setModel(modeloEmbolsar);
		scrollPaneEmbolsar.setViewportView(tablaEmbolsar);
		
		JLabel lblArticulosEmbolsar = new JLabel("Articulos a Embolsar"); // ETIQUETA SUPERIOR
		lblArticulosEmbolsar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		frmEmbolsar.getContentPane().add(lblArticulosEmbolsar, "cell 0 0");

		JButton btnAñadirArticulo = new JButton("Añadir Articulo");  //BOTON AÑADIR ARTICULO
		btnAñadirArticulo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frmEmbolsar.getContentPane().add(btnAñadirArticulo, "cell 0 2");

		frmEmbolsar.setVisible(true);
	}
	
/*	public JFrame getFrame() {
		return this.frmEmbolsar;
	}
	
    public void rellenaListaArticulos(Object[] rowArticulo) {
		
		this.modeloArticulo.addRow(rowArticulo);	
		this.table.setModel(modeloArticulo);
		
	}*/

}
