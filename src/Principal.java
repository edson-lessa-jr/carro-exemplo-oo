import modelo.Carro;

public class Principal {
    public static void main(String[] args) {
    /*
        Caros, adicionei um vetor de objetos no final do exemplo
        como exemplo utilizei o objeto carro para o vetor.
     */
        Carro primeiroCarro = new Carro();
        primeiroCarro.setPlaca("MON89459");
        primeiroCarro.setModelo("Ka");
        primeiroCarro.setQuantidadeDePortas(2);

        Carro segundoCarro = new Carro();
        segundoCarro.setPlaca("PLT12122");
        segundoCarro.setModelo("Ferrari");
        segundoCarro.setQuantidadeDePortas(3);


/*        System.out.println("primeiroCarro = " + primeiroCarro.getPlaca()+"\n" +
                "modelo: "+ primeiroCarro.getModelo()+"\n" +
                "qtd portas"+ primeiroCarro.getQuantidadeDePortas());



                */

        System.out.println("Primeiro modelo.Carro: "+primeiroCarro.imprimir());
        System.out.println("Segundo modelo.Carro: "+segundoCarro.imprimir());

        /* EXEMPLO DE VETOR DE OBJETO*/
        Carro[] vetorCarro= new Carro[2];
        vetorCarro[0]=primeiroCarro;
        vetorCarro[1]=segundoCarro;

        for (int i = 0; i < vetorCarro.length; i++) {
            System.out.println("Carro posição"+i+" - valor -  "+primeiroCarro.imprimir());

        }

    }
}
