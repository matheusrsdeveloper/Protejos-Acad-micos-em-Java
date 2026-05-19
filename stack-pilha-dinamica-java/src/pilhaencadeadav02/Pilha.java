package pilhaencadeadav02;
// A classe Pilha implementa uma pilha din�mica enla�ada 

class Pilha implements TAD_Pilha {  //a classe Pilha implementa o TAD_Pilha
//Nesta vers�o da classe Pilha adicionamos o atributo count e os m�todos
//size e toArray, em forma similar � classe Stack da Oracle. 
 //Tamb�m, acrescentamos o m�todo p�blico getTopo().

    private Node topo = null;
    private int count = 0;

    public Node getTopo() {
        return topo;
    }
    
    public int size() { //retorna a quantidade de objetos guardados na pilha
      return count;
    }
    
    public Object[] toArray() {
    //retorna um vetor com os objetos guardados na pilha, o que poder�
    //ser �til para ordenar ou processar os dados
      if(isEmpty())return null; //opera��o impos�vel se a pilha estiver vazia
      Object vet[] = new Object[count];
      Node aux = topo;
      for(int i=0; i<count; i++) {
          vet[count - i - 1] = aux.getValue();
          aux = aux.getNext();
      }
      return vet;
    }

    public Pilha() {
        topo = null;
    }

    public boolean isEmpty() { //verifica se a pilha est� vazia
        return (topo == null);
        // ou tamb�m: if(topo == null) return true; else return false;
    }

   public Node push(Object x) {
        try {
            if (x == null) return null;  //n�o permitimos inserir um objeto nulo
            long memoriaHeapLivre = Runtime.getRuntime().freeMemory();
            int memoriaNecessaria = x.toString().length() + (1024*1024);  // tamanho de x + 1MB de folga
            if (memoriaHeapLivre <  memoriaNecessaria) {
                return null;  //retornamos null se mem�ria insuficiente
            }
            Node novo = new Node();  //alocamos mem�ria para um novo nodo
            novo.setValue(x);  //atribu�mos valor para o novo n�                   
            novo.setNext(topo);  //no caso de pilha vazia (topo == null) tamb�m funciona   
            topo = novo;
            count++;
            return novo;
        } catch (Exception ex) {
            return null;  // mem�ria insuficiente ou qualquer outro erro
        }
   }

    public Object pop() {
        if (topo == null) return null; // se a pilha estiver vazia retornamos null
        Object valor = topo.getValue();
        topo = topo.getNext(); // avan�ar o topo para o pr�ximo da pilha
        count--;
        return valor;  // retornamos o valor do elemento que estava no topo
    }

    public Object top() { // retornamos o valor no topo, sem elimin�-lo
        if (topo == null) {
            return null;
        } else {
            return topo.getValue();
        }
        // ou:  if(isEmpty()) return null; else return topo.getValue();
    }

    public String toString() {
        //Este m�todo retorna os itens guardados na pilha, com a conven��o p: [ a, b, c, topo ]
        if (!isEmpty()) {
            String resp = "";
            Node aux = topo;
            while (aux != null) {
                resp = aux.getValue().toString() + resp;
                aux = aux.getNext();
                if (aux != null) {
                    resp = ", " + resp;
                }
            }
            return ("p: [ " + resp + " ]");
        } else {
            return ("p: [ ]");
        }
    }

    public String toString2() {
        /*
                Este m�todo retorna os itens guardados na pilha, com a conven��o 
                p: [ 
                    a
                    b
                    c
                    topo
                ]
            
                Mais apropiado para retornar objetos em diferentes linhas, com \n
         */
        if (!isEmpty()) {
            String resp = "";
            Node aux = topo;
            while (aux != null) {
                resp = aux.getValue().toString() + "\n" + resp;
                aux = aux.getNext();
            }
            return resp.trim();
        } else {
            return "";
        }
    }

}
