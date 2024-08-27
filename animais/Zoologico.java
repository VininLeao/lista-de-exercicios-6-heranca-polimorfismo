package animais;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
    }

    public void colocarNaJaula(int indice, Animal animal) {
        if (indice >= 0 && indice < jaulas.length) {
            jaulas[indice] = animal;
        }
    }

    public void percorrerJaulas() {
        for (int i = 0; i < jaulas.length; i++) {
            if (jaulas[i] != null) {
                System.out.println("Jaula " + (i + 1) + ":");

                jaulas[i].emitirSom();

                if (jaulas[i] instanceof Cachorro) {
                    ((Cachorro) jaulas[i]).correr();
                } else if (jaulas[i] instanceof Cavalo) {
                    ((Cavalo) jaulas[i]).correr();
                }

                System.out.println();
            }
        }
    }
}
