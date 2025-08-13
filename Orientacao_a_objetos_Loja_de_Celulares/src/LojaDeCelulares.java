public class LojaDeCelulares {
    public static void main(String[] args) {

        Celular clienteUm, clienteDois, clienteTres;

        clienteUm = new Celular(); //novo objeto (espaco alocado na memória)
        clienteDois = new Celular(); //novo objeto
        clienteTres = new Celular();

        clienteUm.marca = "iPhone";
        clienteUm.modelo = "11 PRO MAX";
        clienteUm.ano = 2019;
        clienteUm.preco = 2900.00;
        clienteUm.armazenamento = 64;

        clienteDois.marca = "iPhone";
        clienteDois.modelo = "15 PRO";
        clienteDois.ano = 2024;
        clienteDois.preco = 4900.00;
        clienteDois.armazenamento = 128;

        clienteTres.marca = "Samsung";
        clienteTres.modelo = "Galaxy S10e";
        clienteTres.ano = 2018;
        clienteTres.preco = 1800.00;
        clienteTres.armazenamento = 64;

        System.out.println("------ cliente um ------");

        clienteUm.exibirCelular();
        clienteUm.calcularGarantia(1);
        clienteUm.calcularDepreciacao();

        double depreciacaoC1 = clienteUm.calcularDepreciacao();

        if(depreciacaoC1 == 0){
            System.out.println();
            System.out.println("Dispositivo inabilitado para revenda");
        }else{
            System.out.println();
            System.out.printf("Depreciação R$ %.2f", depreciacaoC1);
        }

        System.out.println();

        System.out.println("------ cliente dois ------");

        clienteDois.exibirCelular();
        clienteDois.calcularGarantia(2);
        clienteDois.calcularDepreciacao();

        double depreciacaoC2 = clienteDois.calcularDepreciacao();

        if(depreciacaoC2 == 0){
            System.out.println();
            System.out.println("Dispositivo inabilitado para revenda");
        }else{
            System.out.println();
            System.out.printf("Depreciação R$ %.2f", depreciacaoC2);
        }

        System.out.println();

        System.out.println("------ cliente três ------");

        clienteTres.exibirCelular();
        clienteTres.calcularGarantia(3);
        clienteTres.calcularDepreciacao();

        double depreciacaoC3 = clienteTres.calcularDepreciacao();

        if(depreciacaoC3 == 0){
            System.out.println();
            System.out.println("Dispositivo inabilitado para revenda");
        }else{
            System.out.println();
            System.out.printf("Depreciação R$ %.2f", depreciacaoC3);
        }

    }
}
