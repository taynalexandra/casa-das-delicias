package classes.produtos;

import interfaces.Salgado;
import padrao.templatemethod.Massa;

public class Folhado extends Massa implements Salgado{

    @Override
    public String dobrarMassa() {
        System.out.println("Por uma tira sobre a outra e dobrar nas bordas");
        
        return "Por uma tira sobre a outra e dobrar nas bordas";
    }

    @Override
    public String recortarMassa() {
        System.out.println("Recortar três tirar de formato quadrado");
        
        return "Recortar três tiras de formato retangular";
    }

    @Override
    public double custo() {
        return 0.70;
    }

    @Override
    public String descricao() {
        return "folhado recheado com";
    }
    
}
