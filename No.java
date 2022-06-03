package ArvoreTrabalho;

public abstract class No {
	public No esq;
	public No dir;
	public int valor;
	
	public No (int valor) {
		this.valor = valor;
	}
	
	public No(No esq, No dir) {
		this.esq = esq;
		this.dir = dir;
	}

	public No getEsq() {
		return esq;
	}
	
	public No getDir() {
		return dir;
	}
	
	public abstract int calcular();

}
