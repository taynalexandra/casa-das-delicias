package padrao.decorator;

import interfaces.Salgado;

public abstract class DecoratorSalgado implements Salgado{

    public Salgado salgado;
    public Double custo;
    public String descricao;
    
}
