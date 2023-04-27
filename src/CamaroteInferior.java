public class CamaroteInferior extends Vip{
    public void imprimeLocalizacao(){
        setValorIngresso(getValorIngresso() + getValorAdicional() );
        System.out.println("Você selecionou o ingresso VIP INFERIOR no valor de: R$" + getValorIngresso());
    }
}
