package strategypattern;

public class Cliente {

	private Emprestimo emprestimo; 
	
	public void setEmprestimo(Emprestimo emprestimo){
		this.emprestimo = emprestimo;
	}
	
	public void realizarEmprestimo() {
		this.emprestimo.emprestar();
	}
	
}
