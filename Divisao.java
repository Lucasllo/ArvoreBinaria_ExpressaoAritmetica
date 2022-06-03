package ArvoreTrabalho;

public class Divisao extends No{

	public Divisao(No esq, No dir) {
		super(esq, dir);
	}

	public int calcular() {
		return getEsq().calcular() / getDir().calcular();
	}
	
}
