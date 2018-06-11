/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Curso;
import controle.CursoDAO;

/**
 *
 * @author Paulo Henrique Cayres
 */
public class UIConsultaCurso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso c = new Curso(Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Código para consulta: ")));
	
		try {
			CursoDAO dao = new CursoDAO();
                        c = dao.consultarCurso(c.getIdcurso());
			if ( c != null)
                            JOptionPane.showMessageDialog(null, c.getNomeCurso());
                        else
                            JOptionPane.showMessageDialog(null, "Registro não encontrado!!!");
                            
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    
}
