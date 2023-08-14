import javax.swing.JFrame;

import conexion.mysqlConexion;


public class ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*iniciar ventana_principal = new iniciar();
		 ventana_principal.setExtendedState(JFrame.MAXIMIZED_BOTH);
		 ventana_principal.setVisible(true);*/
		 
		 LoginApp ventana_LoginApp = new LoginApp();
		 ventana_LoginApp.setExtendedState(JFrame.MAXIMIZED_BOTH);
		 ventana_LoginApp.setVisible(true);
		
		 /*mysqlConexion objetoconexion = new mysqlConexion();
			objetoconexion.estableceConexion();*/
	}

}
