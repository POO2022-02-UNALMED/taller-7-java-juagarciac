package comunicacion;

public class Alfabeto extends pictograma {
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
		for (int i=0;i<this.letras.length;i++) {
			p+=this.letras[i];
		}
		return p;
	}
	public int cantidadLetras() {
		return this.letras.length;
	}
}
