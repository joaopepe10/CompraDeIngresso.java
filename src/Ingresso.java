public abstract class Ingresso {
    protected  double valorIngresso ;

    public Ingresso() {
        this.valorIngresso = 50;
    }

    public void imprimeValor(){
        System.out.println("Valor do ingresso R$" + this.valorIngresso);
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }
}
