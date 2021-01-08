package classes.produtos;

import padrao.templatemethod.Massa;

public class PastelDeBelem{    
    
    public String modelarMassa() {
        System.out.println("Deformar a massa em uma pequena forma de metal.");
        
        return "Deformar a massa em uma pequena forma de metal";
    }

    public String aplicarMoldeCircular() {
        System.out.println("Aplicar molde circular na massa fina.");
        
        return "Aplicar molde circular na massa fina";
    }
    
    public double preco() {
        return 0.79;
    }
    
    public String rechear() {
        return "a massa circular com recheio de nata até a borda";
    }
}
