package padrao.facade;

import classes.produtos.Coxinha;
import classes.produtos.Folhado;
import classes.produtos.PastelDeBelem;
import classes.produtos.Salgadinho;
import classes.recheio.CharqueDesfiada;
import classes.recheio.FrangoDesfiado;
import classes.recheio.QueijoRalado;
import classes.recheio.Salsa;
import interfaces.Salgado;
import padrao.adapter.AdapterDoce;
import padrao.singleton.AirFryer;

public class ProducaoFacade {
    
    //Preparando o forno
    AirFryer airFryer;
    
    public String produzirCoxinhaDeCharque(){
        
        //Definindo receita de coxinha
        Coxinha receitaDeCoxinha = new Coxinha();
        
        //Preparo da massa
        String massa = receitaDeCoxinha.prepararMassa();
       
        //Acrescentando recheio
        Salgado coxinha = new CharqueDesfiada(new Salsa(receitaDeCoxinha));        
        
        //Fritando o salgado
        airFryer = AirFryer.ligar();
        String statusAirFryer = airFryer.statusAirFryer();
        String fritar = airFryer.fritar(coxinha);
        String pronto = airFryer.retirarMassa();
        
        //Preço da coxinha
        double custo = coxinha.custo();
        
        return massa + statusAirFryer + fritar + pronto + "O valor a pagar é R$" + custo + "<html>";
    }
    
    public String produzirFolhadoDeFrango(){
        //Definindo receita do folhado
        Folhado receitaDeFolhado = new Folhado();
        
        //Preparo da massa
        String massa = receitaDeFolhado.prepararMassa();
        
        //Acrescentando recheio
        Salgado folhado = new FrangoDesfiado(new Salsa(receitaDeFolhado));
        
        //Assando o salgado
        airFryer = AirFryer.ligar();
        String statusAirFryer = airFryer.statusAirFryer();
        String assar = airFryer.assar(folhado);
        String pronto = airFryer.retirarMassa();
        
        //Preço do folhado
        double custo = folhado.custo();
        
        return massa + statusAirFryer + assar + pronto + "O valor a pagar é R$" + custo + "<html>";
    }
    
    public String produzirSalgadinhoDeQueijo(){
        //Definindo receita do salgadinho
        Salgadinho receitaDeSalgadinho = new Salgadinho();
        
        //Preparo da massa
        String massa = receitaDeSalgadinho.prepararMassa();
        
        //Acrescentando recheio
        Salgado salgadinho = new QueijoRalado(receitaDeSalgadinho);
        
        //Assando o salgado
        airFryer = AirFryer.ligar();
        String statusAirFryer = airFryer.statusAirFryer();
        String assar = airFryer.assar(salgadinho);
        String pronto = airFryer.retirarMassa();
        
        //Preço do salgadinho
        double custo = salgadinho.custo();
        
        return massa + statusAirFryer + assar + pronto + "O valor a pagar é R$" + custo + "<html>";
    }
    
    public String produzirPastelDeBelem(){
        //Definindo receita do pastel de Belém
        AdapterDoce receitaDePastelDeBelem = new AdapterDoce(new PastelDeBelem());
        
        //Preparo da massa
        String massa = receitaDePastelDeBelem.prepararMassa();
                        
        //Assando o salgado
        airFryer = AirFryer.ligar();
        String statusAirFryer = airFryer.statusAirFryer();
        String assar = airFryer.assar(receitaDePastelDeBelem);
        String pronto = airFryer.retirarMassa();
        
        //Preço do salgadinho
        double custo = receitaDePastelDeBelem.custo();
        
        return massa + statusAirFryer + assar + pronto + "O valor a pagar é R$" + custo + "<html>";
    }
    
}
