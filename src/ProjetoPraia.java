public class ProjetoPraia {
    public static void main(String args[]){
        crianca c1 = new crianca();
        c1.altura = 1.6;
        c1.corCabelo = "loiro";
        c1.corPele = "branca";
        c1.idade = 14;
        // EXERCICIO
        mulher m1 = new mulher();
        m1.nome = "Fulana";
        m1.corCabelo = "Vermelho";
        m1.corPele = "Morena";
        m1.idade = 23;
        System.out.println(m1.nome);
        System.out.println(m1.corPele);

        m1.deitar();
        m1.bronzear();
        m1.chorar();
    }
}
