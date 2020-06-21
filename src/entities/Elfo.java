package entities;

public class Elfo extends Humanoide{
	
	private boolean orelhaPontuda ;

	public Elfo(Double altura, Double peso, char sexo, int idade, boolean verLonge, boolean verEscuro, boolean orelhaPontuda) {
		super(altura, peso, sexo, idade, verLonge, verEscuro);
		this.orelhaPontuda = orelhaPontuda;
	}

	public boolean isOrelhaPontuda() {
		return orelhaPontuda;
	}

	public void setOrelhaPontuda(boolean orelhaPontuda) {
		this.orelhaPontuda = orelhaPontuda;
	}
	
		
}
