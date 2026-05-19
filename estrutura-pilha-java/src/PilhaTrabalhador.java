import java.util.ArrayList;

public class PilhaTrabalhador {
    private ArrayList<Trabalhador> lista = new ArrayList<>();

    public void empilhar(Trabalhador t) {
        lista.add(t);
    }

    public Trabalhador desempilhar() {
        if (estaVazia()) return null;

        return lista.remove(lista.size() - 1);
    }

    public boolean estaVazia() {
        return lista.isEmpty();
    }
}