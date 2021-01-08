package classes.recheio;

import padrao.decorator.DecoratorSalgado;
import interfaces.Salgado;

public class FrangoDesfiado extends DecoratorSalgado{

    public FrangoDesfiado(Salgado salgado){
        this.salgado = salgado;
    }
    
    
    @Override
    public double custo() {
        return 0.36 + salgado.custo();
    }

    @Override
    public String descricao() {
        return salgado.descricao() + "e frango desfiado.";
    }
    
}
