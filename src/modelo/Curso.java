package modelo;

public class Curso {
	
	private int idcurso;
	private String nomeCurso;
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Curso(int idcurso, String nomecurso) {
		super();
		this.idcurso = idcurso;
		this.nomeCurso = nomecurso;
	}
	public Curso(String nomeCurso) {
		super();
		this.nomeCurso = nomeCurso;
	}

        public Curso(int idcurso) {
            this.idcurso = idcurso;
        }
        
	public int getIdcurso() {
		return idcurso;
	}
	public void setIdcurso(int idcurso) {
		this.idcurso = idcurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomecurso) {
		this.nomeCurso = nomecurso;
	}	
}
