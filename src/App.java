import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Peca peca = new Peca();
        peca.quantidadeEstoque = 0;

        // Aceitar via teclado as informações para cadastrar uma peça
        // Informações: código, nome, descrição, preço unitário e quantidade em estoque
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o código da peça: ");
        peca.codigo = teclado.nextInt();
        System.out.println("Digite o nome da peça: ");
        peca.nome = teclado.next();
        System.out.println("Digite a descrição da peça: ");
        peca.descricao = teclado.next();
        System.out.println("Digite o preço unitário da peça: ");
        peca.precoUnitario = teclado.nextDouble();

        // Coloca a peça em um Objeto
        // Criar um ArrayList para armazenar as peças

        System.out.println("Código: " + peca.codigo);
        System.out.println("Nome: " + peca.nome);
        System.out.println("Descrição: " + peca.descricao);
        System.out.println("Preço Unitário: " + peca.precoUnitario);
        System.out.println("Quantidade em estoque: " + peca.quantidadeEstoque);

        // Alterar o estoque da peça
        // Informar a quantidade a ser adicionada ao estoque
        // Informar a quantidade a ser retirada do estoque

        System.out.println("Quantidade em estoque: " + peca.quantidadeEstoque);
        System.out.println("Digite a quantidade a ser adicionada ao estoque: ");
        int quantidadeAdicionada = teclado.nextInt();
        System.out.println("Quantidade anterior: " + peca.aumentarEstoque(quantidadeAdicionada));    
        System.out.println("Quantidade atual: " + peca.quantidadeEstoque);
        System.out.println("Digite a quantidade a ser retirada do estoque: ");
        int quantidadeRetirada = teclado.nextInt();
        System.out.println("Quantidade anterior: " + peca.diminuirEstoque(quantidadeRetirada));
        System.out.println("Quantidade atual: " + peca.quantidadeEstoque);

        // Calcular o valor do estoque da peça
        System.out.println("Valor do estoque: " + peca.calcularValorEstoque());

        teclado.close();


    }
}
