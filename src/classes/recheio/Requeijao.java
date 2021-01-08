package classes.recheio;

import interfaces.Salgado;
import padrao.decorator.DecoratorSalgado;

public class Requeijao extends DecoratorSalgado{
    
    public Requeijao(Salgado salgado){
        this.salgado = salgado;
    }
    
    
    @Override
    public double custo() {
        return 0.33 + salgado.custo();
    }

    @Override
    public String descricao() {
        return salgado.descricao() + " requeijão";
    }
}
