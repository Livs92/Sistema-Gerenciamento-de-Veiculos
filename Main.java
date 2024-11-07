public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, 4);
        System.out.println(carro.informacoesVeiculo());

        Moto moto = new Moto("Honda", "CB500", 2019, 500);
        System.out.println(moto.informacoesVeiculo());
    }
}

