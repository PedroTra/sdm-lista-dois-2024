public class IMC {
    private double peso;
    private double altura;

    
    public double getPeso() {
        return peso;
    }

   
    public void setPeso(double peso) {
        this.peso = peso;
    }

   
    public double getAltura() {
        return altura;
    }

    
    public void setAltura(double altura) {
        this.altura = altura;
    }

    
    public double calculoIMC() {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura deve ser maior que zero!");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso deve ser maior que zero!");
        }
        return peso / (altura * altura);
    }
}
