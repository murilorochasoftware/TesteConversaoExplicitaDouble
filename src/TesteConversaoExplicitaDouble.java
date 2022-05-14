public class TesteConversaoExplicitaDouble {

    public static void main(String[] args) {
        double quantidadeDouble = 95.1234567890;
        int quantidadeInt = (int) quantidadeDouble;

        System.out.printf("Quantidade double: %.10f", quantidadeDouble);
        System.out.printf("\nQuantidade int: %d", quantidadeInt);
    }
}
