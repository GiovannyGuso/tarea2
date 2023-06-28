package grafos;
import java.util.ArrayList;
import java.util.List;
public class Grafo {
	private int numVertices;
    private List<List<Integer>> adyacencia;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        adyacencia = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adyacencia.add(new ArrayList<>());
        }
    }

    public void agregarArista(int origen, int destino) {
        adyacencia.get(origen).add(destino);
        adyacencia.get(destino).add(origen);
    }

    public void imprimirGrafo() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vértice " + i + ": ");
            for (int j = 0; j < adyacencia.get(i).size(); j++) {
                System.out.print(adyacencia.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
