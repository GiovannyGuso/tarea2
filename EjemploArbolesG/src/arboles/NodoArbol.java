package arboles;

public class NodoArbol {
	int valor;
    NodoArbol izquierdo;
    NodoArbol derecho;

    public NodoArbol(int valor) {
        this.valor = valor;
        izquierdo = null;
        derecho = null;
    }
}
