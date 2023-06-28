package grafos;

public class Main {
	 public static void main(String[] args) {
	        Grafo grafo = new Grafo(5);
	        grafo.agregarArista(0, 1);
	        grafo.agregarArista(0, 4);
	        grafo.agregarArista(1, 2);
	        grafo.agregarArista(1, 3);
	        grafo.agregarArista(1, 4);
	        grafo.agregarArista(2, 3);
	        grafo.agregarArista(3, 4);

	        grafo.imprimirGrafo();
	    }
}
