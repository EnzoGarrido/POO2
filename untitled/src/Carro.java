public class Carro {
    private String fabricante;
    private String modelo;
    private double preco;
    private boolean ligado;

    public String getFabricante(){
        return fabricante;
    }
    public void setFabricante(String f){
        fabricante = f;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String m){
        modelo = m;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double p) {
        preco = p;
    }
    public boolean isLigado(){
        return ligado;

    }
    public void setLigado(boolean l){
        ligado = l;
    }
}


