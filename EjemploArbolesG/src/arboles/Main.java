package arboles;

public class Main {
	 public static void main(String[] args) {
	        Arbol arbol = new Arbol();
	        arbol.insertar(50);
	        arbol.insertar(30);
	        arbol.insertar(70);
	        arbol.insertar(20);
	        arbol.insertar(40);

	        System.out.println("Recorrido inorden del árbol:");
	        arbol.inorden();
	    }
}
