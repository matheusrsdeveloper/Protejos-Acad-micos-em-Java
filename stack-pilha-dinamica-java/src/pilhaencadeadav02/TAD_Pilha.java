package pilhaencadeadav02;

public interface TAD_Pilha {
    public int size(); //retorna a quantidade de objetos guardados na pilha   
    public Object [] toArray(); 
    public Object push(Object x);
    public Object pop();
    public Object top();
    public boolean isEmpty();
}
