package visao;

import javax.swing.JOptionPane;
import modelo.Curso;
import controle.CursoDAO;

public class UIGravaCurso {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso c = new Curso();
		c.setNomeCurso(JOptionPane.showInputDialog(("Digite o nome do curso: ")));
		
		try {
			CursoDAO dao = new CursoDAO();
			dao.inserirCurso(c);
			JOptionPane.showMessageDialog(null, "Registro gravado com sucesso!!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
