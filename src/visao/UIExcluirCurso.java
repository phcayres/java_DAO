package visao;

import controle.CursoDAO;
import javax.swing.JOptionPane;
import modelo.Curso;

/**
 *
 * @author Paulo Henrique Cayres
 */

public class UIExcluirCurso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso c = new Curso(Integer.parseInt(JOptionPane.showInputDialog("Código para excluir: ")));
		
		try {
			CursoDAO dao = new CursoDAO();
			dao.excluirCurso(c);
			JOptionPane.showMessageDialog(null, "Registro excluído com sucesso!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


