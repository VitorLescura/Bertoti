package strategypattern;

public class Cliente {

	private Emprestimo emprestimo; //aqui o polimorfismo
	
	public void setEmprestimo(Emprestimo emprestimo){//argumento polimorfico
		this.emprestimo = emprestimo;
	}
	
	public void realizarEmprestimo() {
		this.emprestimo.emprestar();
	}
	
}
