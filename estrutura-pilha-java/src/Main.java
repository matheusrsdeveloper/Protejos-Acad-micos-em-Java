import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Veiculo> pilhaVeiculos = new Stack<>();

        pilhaVeiculos.push(new Veiculo("ABC-1234", "Toyota", "Corolla", 2022));
        pilhaVeiculos.push(new Veiculo("XYZ-5678", "Honda", "Civic", 2023));
        pilhaVeiculos.push(new Veiculo("KJH-9900", "Ford", "Mustang", 1969));

        System.out.println("Retirando veículos da Pilha ");
        
        while (!pilhaVeiculos.isEmpty()) {
            System.out.println(pilhaVeiculos.pop());
        }
    }
}
