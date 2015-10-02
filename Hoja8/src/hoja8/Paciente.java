/*----------------------------------------------------------------------------------
Algoritmos y estructura de datos
Seccion 30

Autor:
Marlon Josue Castillo Martinez      14427
Hoja 8
-----------------------------------------------------------------------------------*/
public class Paciente implements Comparable<Paciente>{
    //atributos
    private String nombre;
    private String sintoma;
    private String codigo;
    //constructor
    public Paciente(String nombre, String sintoma, String codigo) {
	this.nombre = nombre;
	this.sintoma=sintoma;
	this.codigo=codigo;
    }
    
    //set y get para los atributos
    public String getNombre(){
    	return nombre;
    }
    public String getSintoma(){
    	return sintoma;
    }
    public String getCodigo(){
    	return codigo;
    }
    
    //metodo para comparar los codigos y ordenarlos alfabeticamente
    public int compareTo(Paciente segundo){
    	return this.getCodigo().compareTo(segundo.getCodigo());
    }
}