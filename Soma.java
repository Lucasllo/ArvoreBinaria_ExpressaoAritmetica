
package ArvoreTrabalho;

public class Soma extends No{

	public Soma(No esq, No dir) {
		super(esq, dir);
	}

	public int calcular() {
		return getEsq().calcular() + getDir().calcular();
	}
	
}
