import java.util.Scanner;

public class RegistrarProduto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Produto produto1 = new Produto(
                123,
                "Batata Inglesa",
                5.98);

        Produto produto2 = new Produto(
                456,
                "Arroz",
                11.77);

        // EDITAR PRODUTOS:

        int opcao;
        double valor;

        do{
            System.out.println("---- Sistema de Produtos ----");
            System.out.println("1 - Exibir Produto / 2 - Editar Produto  / -1 - Encerrar");
            opcao = teclado.nextInt();
            switch(opcao){
                case 1:
                    System.out.println(produto1.exibirProduto());
                    break;
                case 2:
                    System.out.println("Alterar Valor:");
                    valor = teclado.nextDouble();
                    produto1.editarValorProduto(valor);
                    break;
                case -1:
                    System.out.println("Obrigado por usar nosso programa!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }

        } while(opcao != -1);

        teclado.close();
    }

}
