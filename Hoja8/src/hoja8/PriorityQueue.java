/*----------------------------------------------------------------------------------
Algoritmos y estructura de datos
Seccion 30

Autor:
Marlon Josue Castillo Martinez      14427
Hoja 8
-----------------------------------------------------------------------------------*/

/**
 *
 * @author Marlon
 * @param <E>
 */

public interface PriorityQueue<E extends Comparable<E>>
{

    /**
     *
     * @return
     */
    public E getFirst();
	// pre: !isEmpty()
	// post: returns the minimum value in priority queue
	
    /**
     *
     * @return
     */
    public E remove();
	// pre: !isEmpty()
	// post: returns and removes minimum value from queue
	
    /**
     *
     * @param value
     */
    public void add(E value);
	// pre: value is non-null comparable
	// post: value is added to priority queue
}