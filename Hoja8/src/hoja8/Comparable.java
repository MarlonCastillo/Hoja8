public interface Comparable<E>{
    //compara los nombres para crear un orden alfabetico
    //regresa -1 si el el primero es menor al segundo
    //regresa 1 si el primero es mayor al segundo
    //regresa 0 si el primero es igual al segundo
    public int compareTo(E segundo);
	    
}