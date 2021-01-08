package classes.recheio;

import interfaces.Salgado;
import padrao.decorator.DecoratorSalgado;

public class QueijoRalado extends DecoratorSalgado{
    
    public QueijoRalado(Salgado salgado){
        this.salgado = salgado;
    }
    
    
    @Override
    public double custo() {
        return 0.22 + salgado.custo();
    }

    @Override
    public String descricao() {
        return salgado.descricao() + " queijo ralado.";
    }
    
}
