package animais;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça está emitindo um som!");
    }

    public void subirArvore() {
        System.out.println("A preguiça está subindo na árvore!");
    }
}
