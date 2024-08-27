package animais;

public class TesteAnimais {
    public static void main(String[] args) {
        //Exercicio 2
        Animal cachorro = new Cachorro("Belinha", 5);
        Animal cavalo = new Cavalo("Spirit", 7);
        Animal preguica = new Preguica("Sid", 3);

        Animal[] animais = {cachorro, cavalo, preguica};

        for (int i = 0; i < animais.length; i++) {
            animais[i].emitirSom();
        }
        System.out.println();

        //Exercicio 3
        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
        System.out.println();

        //Exercicio 4
        Animal cachorro1 = new Cachorro("Marley", 5);
        Animal cachorro2 = new Cachorro("Rex", 3);
        Animal cachorro3 = new Cachorro("Bolt", 4);
        Animal cavalo1 = new Cavalo("Spirit", 7);
        Animal cavalo2 = new Cavalo("Pé de Pano", 6);
        Animal cavalo3 = new Cavalo("Trovao", 8);
        Animal preguica1 = new Preguica("Sid", 3);
        Animal preguica2 = new Preguica("Manny", 4);
        Animal preguica3 = new Preguica("Scrat", 2);
        Animal cachorro4 = new Cachorro("Marley", 5);
        Zoologico zoologico = new Zoologico();

        zoologico.colocarNaJaula(0, cachorro1);
        zoologico.colocarNaJaula(1, cavalo1);
        zoologico.colocarNaJaula(2, preguica1);
        zoologico.colocarNaJaula(3, cachorro2);
        zoologico.colocarNaJaula(4, cavalo2);
        zoologico.colocarNaJaula(5, preguica2);
        zoologico.colocarNaJaula(6, cachorro3);
        zoologico.colocarNaJaula(7, cavalo3);
        zoologico.colocarNaJaula(8, preguica3);
        zoologico.colocarNaJaula(9, cachorro4);

        zoologico.percorrerJaulas();
    }
    }
