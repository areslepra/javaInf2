package Problema13;

@SuppressWarnings("serial")
class hombre extends Persona{
	
	boolean corpulento;
	
	hombre(String nom, double altura, double p, boolean corpulento) {
		super(nom, altura, p);
		this.corpulento = corpulento;
	}
	
	public float pesoTeorico() {
		float pt = 53;
		if(super.estatura > 1.5)
			pt += Math.floor((estatura - 1.5) / 0.025) * 3; 
		if(corpulento)
			pt += pt * 0.1;
		return pt;
	}
	
	public String OMS() {
		double imc = super.IMC();
		if(imc < 18.5)
			return "Peso Bajo";
		if(imc <= 24.9)
			return "Peso Normal";
		if(imc <= 29.9)
			return "Sobrepeso";
		if(imc <= 40)
			return "Obesidad Grado 2";
		return "Obesidad Severa";
	}

	@Override
	public String toString() {
		return super.nombre() + " [OMS()=" + OMS() + ", peso=" + super.peso	+ "]";
	}
	
	
}
