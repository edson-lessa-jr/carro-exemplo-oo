package modelo;

public class Carro {
    private String placa;
    private String modelo;
    private int quantidadeDePortas;

    public void setPlaca(String placa) {
        if ((placa.length() == 8)||(placa.length() == 9)) {
            this.placa = placa;
        } else {
            System.out.println("Placa inválida");
        }
    }

    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        if ((quantidadeDePortas > 0) && (quantidadeDePortas < 9)) {
            this.quantidadeDePortas = quantidadeDePortas;
        } else {
            System.out.println("Quantidade de portas inválidas");
        }
    }
    public String imprimir(){
        return "modelo.Carro:\n" +
                "Placa: " + this.getPlaca() +"\n"+
                "Modelo: "+ this.getModelo()+ "\n" +
                "Qtd portas: "+ this.getQuantidadeDePortas();
    }
}
