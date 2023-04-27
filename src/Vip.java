public class Vip extends Ingresso{
    protected  double valorAdicional = 50;

    public  void valorExtra(){
        setValorIngresso(getValorAdicional() + getValorIngresso());
        System.out.println("Valor do ingresso vip: R$" + getValorIngresso());
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
