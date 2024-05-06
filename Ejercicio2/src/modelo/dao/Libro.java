package modelo.dao;

public class Libro {
	private long isbn;
	private String titulo;
	private double precio;
	private int paginas;
	private Autor Autor;
	public Libro(long isbn, String titulo, double precio, int paginas, modelo.dao.Autor autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.precio = precio;
		this.paginas = paginas;
		Autor = autor;
	}
	public Libro() {
		super();
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public Autor getAutor() {
		return Autor;
	}
	public void setAutor(Autor autor) {
		Autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", precio=" + precio + ", paginas=" + paginas + ", Autor="
				+ Autor + "]";
	}
	
	
	
	
	
	}
	

