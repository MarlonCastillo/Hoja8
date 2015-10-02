/*----------------------------------------------------------------------------------
Algoritmos y estructura de datos
Seccion 30

Autor:
Marlon Josue Castillo Martinez      14427
Hoja 8
-----------------------------------------------------------------------------------*/

//importamos las clases a utilizar
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) {
        //variables para almacenar los atributos de los pacientes
        String nombre="";
        String sintoma="";
        String codigo="";
        int contador=0;     //contador del numero de pacientes
        VectorHeap<Paciente> cola = new VectorHeap<Paciente>(); //creamos un nuevo Vectorheap
        try{
            FileReader lector=new FileReader("paciente.txt");
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);
            String linea; //almacena la linea del txt
            //recorremos todo el txt
            while((linea=contenido.readLine())!=null) {
                //extraemos el nombre del paciente
                for (int x=0;x<linea.length();x++){
                    char letra=linea.charAt(x); //recorre caracter por caracter
                    if (!String.valueOf(letra).equals(",")){ 
                        nombre=nombre+letra;
                    } else {
                        //cuando encuentre una coma deja de almacenar en nombre y comienza a almacenar en sintoma
                        int z=linea.length()-2-x;
                        for (int y=0;y<z;y++){
                            letra=linea.charAt(x);
                            sintoma=sintoma+letra;
                            x=x+1; 
                        }
                        //creamos un nuevo objeto de tipo paciente y le damos los parametros necesarios
                        Paciente pacientes = new Paciente(nombre,sintoma,String.valueOf(linea.charAt(linea.length()-1)));
                        contador=contador+1; //contamos a los pacientes
                        cola.add(pacientes); //agregamos a la cola el paciente
                        nombre="";
                        sintoma="";
                        codigo="";
                        break;
                    }

                }
               
            }
        }
        //si hay un error al leer el txt nos muestra este mensaje
        catch(Exception e) {
            System.out.println("Error al leer el archivo.");
        }
        System.out.print("\n");
        Paciente[] pacientess= new Paciente[contador]; //arreglo de pacientes
        for (int y=0; y<contador; y++){
            pacientess[y]=new Paciente("","",""); //instanciamos un paciente
            pacientess[y]=cola.remove(); //removemos al paciente de la cola
            System.out.println(pacientess[y].getNombre()+pacientess[y].getSintoma()+" "+pacientess[y].getCodigo()); //mostramos el resultado
        }
    }
}