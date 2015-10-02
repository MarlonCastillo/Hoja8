public class Paciente implements Comparable<Paciente>{
	private String nombre;
	private String sintoma;
	private String codigo;
	//constructor
	public Paciente(String nombre, String sintoma, String codigo) {
		this.nombre = nombre;
		this.sintoma=sintoma;
		this.codigo=codigo;
	}
    public String getNombre(){
    	return nombre;
    }
    public String getSintoma(){
    	return sintoma;
    }
    public String getCodigo(){
    	return codigo;
    }
    public int compareTo(Paciente segundo){
    	return this.getCodigo().compareTo(segundo.getCodigo());
    }
}