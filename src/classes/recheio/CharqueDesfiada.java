package classes.recheio;

import interfaces.Salgado;
import padrao.decorator.DecoratorSalgado;

public class CharqueDesfiada extends DecoratorSalgado{
    
    public CharqueDesfiada(Salgado salgado){
        this.salgado = salgado;
    }
    
    
    @Override
    public double custo() {
        return 0.42 + salgado.custo();
    }

    @Override
    public String descricao() {
        return salgado.descricao() + "e charque desfiada.";
    }
}
