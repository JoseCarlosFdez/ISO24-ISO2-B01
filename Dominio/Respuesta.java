public class Respuesta {
	private String _estado;
	private String _mensaje;
	private Object _datos;

	public String getMensaje() {
		return this._mensaje;
	}

	public Object getDatos() {
		return this._datos;
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}