/**
 * A classe {@code Pessoa} representa uma pessoa e implementa a interface {@code Atividades}.
 * Fornece métodos para realizar atividades básicas como acordar, andar, comer e dormir.
 */
public class Pessoa implements Atividades {

    private boolean acordado;

    /**
     * Constrói uma nova instância da classe {@code Pessoa}, inicialmente com a pessoa adormecida.
     */
    public Pessoa() {
        this.acordado = false;
    }

    /**
     * Acorda a pessoa.
     */
    @Override
    public void acordar() {
        if (!acordado) {
            acordado = true;
            System.out.println("Pessoa acordou.");
        } else {
            System.out.println("Pessoa já está acordada.");
        }
    }

    /**
     * Faz a pessoa andar.
     */
    @Override
    public void andar() {
        if (acordado) {
            System.out.println("Pessoa está andando.");
        } else {
            System.out.println("Pessoa está dormindo e não pode andar.");
        }
    }

    /**
     * Faz a pessoa comer.
     */
    @Override
    public void comer() {
        if (acordado) {
            System.out.println("Pessoa está comendo.");
        } else {
            System.out.println("Pessoa está dormindo e não pode comer.");
        }
    }

    /**
     * Faz a pessoa dormir.
     */
    @Override
    public void dormir() {
        if (acordado) {
            acordado = false;
            System.out.println("Pessoa está dormindo.");
        } else {
            System.out.println("Pessoa já está dormindo.");
        }
    }
}
