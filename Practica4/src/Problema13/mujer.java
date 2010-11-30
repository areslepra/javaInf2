package Problema13;

@SuppressWarnings("serial")
class mujer extends Persona{
	
	private int cantidad_de_hijos;
	
	public mujer(String nom, double alto, double peso, int hijos){
		super(nom, alto, peso);
		this.cantidad_de_hijos = hijos;
	}

	public float pesoTeorico() {
		float pt = 50;
		if(super.estatura > 1.5)
			pt += Math.floor((estatura - 1.5) / 0.025) * 2.5; 
		if(this.cantidad_de_hijos == 1)
			pt += 0.65;
		if(this.cantidad_de_hijos > 1)
			pt += 1.3;
		return pt;
	}
	
	public String OMS() {
		double imc = super.IMC();
		if(imc < 18.5)
			return "Peso Bajo";
		if(imc <= 23.9)
			return "Peso Normal";
		if(imc <= 28.9)
			return "Sobrepeso";
		if(imc <= 37)
			return "Obesidad Grado 2";
		return "Obesidad Severa";
	}

	@Override
	public String toString() {
		return super.nombre() + " [OMS()=" + OMS() + ", peso=" + super.peso	+ "]";
	}

}
