package visao;

import controle.CursoDAO;
import javax.swing.JOptionPane;
import modelo.Curso;

/**
 *
 * @author Paulo Henrique Cayres
 */

public class UIAtualizaCurso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso c = new Curso(Integer.parseInt(JOptionPane.showInputDialog("Código para alteração: ")),
                                    JOptionPane.showInputDialog("Digite o novo nome: "));
		
		try {
			CursoDAO dao = new CursoDAO();
			dao.atualizarCurso(c);
			JOptionPane.showMessageDialog(null, "Registro alterado com sucesso!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
