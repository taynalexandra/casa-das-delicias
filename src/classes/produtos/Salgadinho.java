package classes.produtos;

import interfaces.Salgado;
import padrao.templatemethod.Massa;

public class Salgadinho extends Massa implements Salgado{

    @Override
    public String dobrarMassa() {
        System.out.println("Amassar levemente as partes superior e inferior da esfera.");
        
        return "Amassar levemente com um garfo a parte superior da esfera";
    }

    @Override
    public String recortarMassa() {
        System.out.println("Separar um pedaço esférico pequeno da massa.");
        
        return "Separar um pedaço esférico pequeno da massa";
    }

    @Override
    public double custo() {
        return 0.3;
    }

    @Override
    public String descricao() {
        return "salgadinho com";
    }
    
}
