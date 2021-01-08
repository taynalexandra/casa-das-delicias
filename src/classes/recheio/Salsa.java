package classes.recheio;

import interfaces.Salgado;
import padrao.decorator.DecoratorSalgado;

public class Salsa extends DecoratorSalgado{
    
    public Salsa(Salgado salgado){
        this.salgado = salgado;
    }
    
    
    @Override
    public double custo() {
        return 0.07 + salgado.custo();
    }

    @Override
    public String descricao() {
        return salgado.descricao() + "salsa ";
    }
}
