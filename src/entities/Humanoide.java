package entities;

public abstract class Humanoide {
		private Double altura;
		private Double peso;
		private char sexo;
		private int idade;
		private boolean verLonge = false;
		private boolean verEscuro = false;
		
		public Humanoide() {
			
		}
		
		public Humanoide(Double altura, Double peso, char sexo, int idade, boolean verLonge, boolean verEscuro) {
			this.altura = altura;
			this.peso = peso;
			this.sexo = sexo;
			this.idade = idade;
			this.verLonge = verLonge;
			this.verEscuro = verEscuro;
			
		}

		public void setAltura(Double altura) {
			this.altura = altura;
		}
		
		public Double getAltura() {
			return this.altura;
		}

		public Double getPeso() {
			return peso;
		}

		public void setPeso(Double peso) {
			this.peso = peso;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public boolean isVerLonge() {
			return verLonge;
		}

		public void setVerLonge(boolean verLonge) {
			this.verLonge = verLonge;
		}

		public boolean isVerEscuro() {
			return verEscuro;
		}

		public void setVerEscuro(boolean verEscuro) {
			this.verEscuro = verEscuro;
		}
		
		
}
