package comunicacion;

public class Libro extends Escrito {
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas,String co_autor,String editorial,String edicion, String interpretacion) {
		super(origen,titulo,autor,paginas);
		this.co_autor=co_autor;
		this.editorial=editorial;
		this.edicion=edicion;
		this.interpretacion=interpretacion;
	}
	public String getCo_autor() {
	return this.co_autor;
	}
	public void setCo_autor(String co_autor) {
		this.co_autor=co_autor;
	}
	
	public String getEditorial() {
		return this.editorial;
		}
	public void setEditorial(String co_autor) {
			this.editorial=co_autor;
		}
	public String getEdicion() {
		return this.edicion;
		}
	public void setEdicion(String co_autor) {
			this.edicion=co_autor;
		}
	
	public String getInterpretacion() {
		return this.interpretacion;
		}
	public void setInterpretacion(String co_autor) {
			this.interpretacion=co_autor;
		}
	public String interpretacion() {
		return this.interpretacion;
		}
	public int palabrasTotales(int factor) {
		return factor*this.getPaginas()*2;
	}
	public String toString() {
		return this.getOrigen()+"\n"+this.getTitulo()+"\n"+this.getAutor()+"\n"+this.getPaginas()+"\n"+this.getCo_autor()+"\n"+this.getEditorial()+"\n"+this.getEdicion();
	}
}
