package padrao.adapter;

import classes.produtos.PastelDeBelem;
import interfaces.Salgado;
import padrao.templatemethod.Massa;

public class AdapterDoce extends Massa implements Salgado{
    
    PastelDeBelem pdb;
    
    public AdapterDoce(PastelDeBelem pdb){
        this.pdb = pdb;
    }

    @Override
    public String recortarMassa() {
        String recorte = pdb.aplicarMoldeCircular();
        
        return recorte;
    }

    @Override
    public String dobrarMassa() {
        String dobra = pdb.modelarMassa();
        
        return dobra;
    }
    
    public double custo() {
        return pdb.preco();
    }
    
    public String descricao() {
        return pdb.rechear();
    }
    
    
}
