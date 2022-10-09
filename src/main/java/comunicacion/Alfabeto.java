package comunicacion;

public class Alfabeto extends Pictograma {
	private String[] letras;
	private String interpretacion;
	
	public Alfabeto(String origen,String[] letras,String interpretacion){
		super(origen);
		this.letras=letras;
		this.interpretacion=interpretacion;
	}
	public String[] getLetras() {
		return letras;
	}
	public void setLetras(String[] letras) {
		this.letras=letras;
	}
	public String interpretacion() {
		return interpretacion;
		}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion=interpretacion;
	}
	public String toString() {
		String p="";
		for (int i=0;i<this.letras.length-1;i++) {
			p+=this.letras[i]+", ";
		}
		p+=this.letras[this.letras.length-1];
		return p;
	}
	public int cantidadLetras() {
		return this.letras.length;
	}
}
