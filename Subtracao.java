package ArvoreTrabalho;

public class Subtracao extends No{

	public Subtracao(No esq, No dir) {
		super(esq, dir);
	}

	public int calcular() {
		return getEsq().calcular() - getDir().calcular();
	}
	
}
