import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class main {
    public static void main(String[] args) {
        String nombre="";
        String sintoma="";
        String codigo="";
        int siguiente=0;
        int contador=0;
        VectorHeap<Paciente> cola = new VectorHeap<Paciente>();
        try{
            FileReader lector=new FileReader("paciente.txt");
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            String linea;
            while((linea=contenido.readLine())!=null) {
                for (int x=0;x<linea.length();x++){
                    char letra=linea.charAt(x);
                    //if ((String.valueOf(letra).equals("A") || String.valueOf(letra).equals("B") || String.valueOf(letra).equals("C") || String.valueOf(letra).equals("D") || String.valueOf(letra).equals("E"))){ codigo=codigo+letra; }
                    if (!String.valueOf(letra).equals(",")){ 
                        nombre=nombre+letra;
                    } else { 
                        int z=linea.length()-2-x;
                        for (int y=0;y<z;y++){
                            letra=linea.charAt(x);
                            sintoma=sintoma+letra;
                            x=x+1; 
                        }
                        Paciente pacientes = new Paciente(nombre,sintoma,String.valueOf(linea.charAt(linea.length()-1)));
                        contador=contador+1;
                        cola.add(pacientes);
                        nombre="";
                        sintoma="";
                        codigo="";
                        break;
                    }

                }
               
            }
        }
        catch(Exception e) {
            System.out.println("Error al leer el archivo.");
        }
        System.out.print("\n");
        Paciente[] pacientess= new Paciente[contador];
        for (int y=0; y<contador; y++){
            pacientess[y]=new Paciente("","","");
            pacientess[y]=cola.remove();
            System.out.println(pacientess[y].getNombre()+pacientess[y].getSintoma()+" "+pacientess[y].getCodigo());
        }
    }
}