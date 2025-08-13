public class Celular {

    // características do objeto

    String marca;
    String modelo;
    int ano;
    double preco;
    int armazenamento;

    double valorBaseGarantia = 249.99;

    void exibirCelular(){
        System.out.println("Marca: " + marca + " - Modelo: " + modelo);
        System.out.println("Ano: " + ano + " - Armazenamento: " + armazenamento);
        System.out.printf("Preço: %.2f\n", preco);
    }

    void calcularGarantia(int tipoCliente){

        switch(tipoCliente){
            case 1:
                System.out.printf("Garantia para estudante: R$ %.2f",
                        valorBaseGarantia - (valorBaseGarantia * 0.15));
                break;
            case 2:
                System.out.printf("Garantia para cliente normal: R$ %.2f",
                        valorBaseGarantia - (valorBaseGarantia * 0.00));
                break;
            case 3:
                System.out.printf("Garantia para cliente empresarial: R$ %.2f",
                        valorBaseGarantia + (valorBaseGarantia * 0.25));
                break;
            default:
                System.out.println("Tipo de cliente invalido");
        }

    }

    double calcularDepreciacao(){

        double depreciacao;

        if(ano <= 2018){
            depreciacao = 0;
        }else{
            depreciacao = preco * 0.30;
        }

        return depreciacao;

    }

}
