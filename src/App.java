import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Peca> pecas = new ArrayList<Peca>();


        // Aceitar via teclado as informações para cadastrar uma peça
        // Informações: código, nome, descrição, preço unitário e quantidade em estoque
        Scanner teclado = new Scanner(System.in);


        //Cria um loop para entrar com várias peças
        //Se o código for 0, sai do loop
        while (true) {
            System.out.println("Digite o código da peça: ");
            int codigo = teclado.nextInt();
            if (codigo == 0) {
                break;
            }
            System.out.println("Digite o nome da peça: ");
            String nome = teclado.next();
            System.out.println("Digite a descrição da peça: ");
            String descricao = teclado.next();
            System.out.println("Digite o preço unitário da peça: ");
            double precoUnitario = teclado.nextDouble();
            System.out.println("Digite a quantidade em estoque da peça: ");
            int quantidadeEstoque = teclado.nextInt();

            Peca peca = new Peca();
            peca.codigo = codigo;
            peca.nome = nome;
            peca.descricao = descricao;
            peca.precoUnitario = precoUnitario;
            peca.quantidadeEstoque = quantidadeEstoque;

            pecas.add(peca);
        }

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

        // Verificar se já existe um arquivo chamado pecas.txt
        // Se não existir, criar o arquivo
        // Se existir, abrir o arquivo para escrita
        // Escrever no arquivo as informações de cada peça
        // Fechar o arquivo
        File arquivo = new File("pecas.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }
        java.io.FileWriter escritor = new java.io.FileWriter(arquivo);
        for (Peca peca : pecas) {
            escritor.write("Código: " + peca.codigo + "\n");
            escritor.write("Nome: " + peca.nome + "\n");
            escritor.write("Descrição: " + peca.descricao + "\n");
            escritor.write("Preço Unitário: " + peca.precoUnitario + "\n");
            escritor.write("Quantidade em estoque: " + peca.quantidadeEstoque + "\n");
            escritor.write("Valor do estoque: " + peca.calcularValorEstoque() + "\n");
        }
        escritor.close();

    }
}
