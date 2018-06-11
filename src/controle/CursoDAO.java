package controle;

import java.sql.*;
import modelo.Curso;

/**
 *
 * @author Cayres
 */
public class CursoDAO {

    private final Connection con;

    public CursoDAO() throws Exception {
      this.con = new ConnectionFactoryComProperties().getConnectionCurso();
    }

    public void inserirCurso(Curso c){
        try{
            PreparedStatement stmt = this.con.prepareStatement("insert into curso (nome) values(?)");
            stmt.setString(1, c.getNomeCurso());
            stmt.execute();
        }
        catch(SQLException e){
            System.out.println("incluirCurso(): "+e.toString());
        }
    }

    public Curso consultarCurso(int cod){
        try{
            PreparedStatement stmt = this.con.prepareStatement("select * from curso where idcurso = ?");
            stmt.setInt(1, cod);
            ResultSet res = stmt.executeQuery();
            if(res.next())
            	return new Curso(res.getInt("idcurso"),res.getString("nome"));
            else
            	return null;
        }
        catch(SQLException e){
            System.out.println("consultarCurso(): "+e.toString());
        }
        return null;
    }

    public void atualizarCurso(Curso c){
        try{
            PreparedStatement stmt = this.con.prepareStatement("update curso set nome=? where idcurso=?");
            stmt.setString(1, c.getNomeCurso());
            stmt.setInt(2, c.getIdcurso());
            stmt.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("atualizarCurso(): "+e.toString());
        }
    }

    public void excluirCurso(Curso c){
        try{
            PreparedStatement stmt = this.con.prepareStatement("delete from curso where idcurso=?");
            stmt.setInt(1, c.getIdcurso());
            stmt.executeUpdate();
        }
        catch(SQLException e){
            System.out.println("excluirCurso(): "+e.toString());
        }
    }
    
}