package ArvoreTrabalho;

public class Multiplicacao extends No{

	public Multiplicacao(No esq, No dir) {
		super(esq, dir);
	}

	public int calcular() {
		return getEsq().calcular() * getDir().calcular();
	}
	
}
