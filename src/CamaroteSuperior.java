public class CamaroteSuperior extends Vip{
    private double novoValorExtra = 100;
    public  double retornaValorIngresso(){
        setValorIngresso(getValorIngresso() + getNovoValorExtra() + getValorAdicional());
        System.out.println("Valor do ingresso: R$" + getValorIngresso());
        return getValorIngresso();
    }

    public double getNovoValorExtra() {
        return novoValorExtra;
    }

    public void setNovoValorExtra(double novoValorExtra) {
        this.novoValorExtra = novoValorExtra;
    }
}
