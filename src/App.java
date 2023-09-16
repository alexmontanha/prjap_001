import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        ArrayList<Peca> pecas = new ArrayList<Peca>();


        // Aceitar via teclado as informações para cadastrar uma peça
        // Informações: código, nome, descrição, preço unitário e quantidade em estoque
        Scanner teclado = new Scanner(System.in);


        Peca peca1 = new Peca();
        peca1.quantidadeEstoque = 0;

        System.out.println("Digite o código da peça: ");
        peca1.codigo = teclado.nextInt();
        System.out.println("Digite o nome da peça: ");
        peca1.nome = teclado.next();
        System.out.println("Digite a descrição da peça: ");
        peca1.descricao = teclado.next();
        System.out.println("Digite o preço unitário da peça: ");
        peca1.precoUnitario = teclado.nextDouble();


        Peca peca2 = new Peca();
        peca2.quantidadeEstoque = 0;

        // Aceitar via teclado as informações para cadastrar uma peça
        // Informações: código, nome, descrição, preço unitário e quantidade em estoque

        System.out.println("Digite o código da peça: ");
        peca2.codigo = teclado.nextInt();
        System.out.println("Digite o nome da peça: ");
        peca2.nome = teclado.next();
        System.out.println("Digite a descrição da peça: ");
        peca2.descricao = teclado.next();
        System.out.println("Digite o preço unitário da peça: ");
        peca2.precoUnitario = teclado.nextDouble();


        // Coloca a peça em um Objeto
        // Criar um ArrayList para armazenar as peças
        // Adicionar a peça no ArrayList
        pecas.add(peca1);
        pecas.add(peca2);

        //Iterar no ArrayList e imprimir as informações de cada peça
        for (Peca peca : pecas) {
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
        }


        teclado.close();


    }
}
