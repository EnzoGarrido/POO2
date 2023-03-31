public class Main {
    public static void main(String[]args){
        Carro car1 = new Carro();

        car1.setFabricante("Toyota");
        car1.setModelo("Corolla");
        car1.setPreco(15.5);
        car1.setLigado(true);

        System.out.println(car1.getFabricante());
        System.out.println(car1.getModelo());
        System.out.println(car1.getPreco());
        System.out.println(car1.isLigado());
    }
}