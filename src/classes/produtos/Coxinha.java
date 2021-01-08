package classes.produtos;

import interfaces.Salgado;
import padrao.templatemethod.Massa;

public class Coxinha extends Massa implements Salgado{
    
    @Override
    public String dobrarMassa() {
        System.out.println("Formar uma cavidade interna.");
        
        return "Formar uma cavidade interna";
    }

    @Override
    public String recortarMassa() {
        System.out.println("Separar uma porção esférica da massa.");
        
        return "Separar uma porção esférica da massa";
    }

    @Override
    public double custo() {
        return 0.9;
    }

    @Override
    public String descricao() {
        return "coxinha recheada com ";
    }
    
}
