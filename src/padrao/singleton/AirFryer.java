package padrao.singleton;

import interfaces.Salgado;
import padrao.templatemethod.Massa;

public class AirFryer {
    
    private static AirFryer airFryer;
    private static String airFryerLigado;
    
    private AirFryer(){
        
    }
    
    public static AirFryer getInstance(){
        if(airFryer == null){
            airFryer = new AirFryer();
            airFryerLigado = "AirFryer ligado";
            System.out.println("AirFryer ligado");
        }else{
            airFryerLigado = "O AirFryer já está ligado!";
            System.out.println("O AirFryer já está ligado!");
        }
        
        return airFryer;
    }
    
    public static AirFryer ligar(){
        return getInstance();
    }
    
    public String statusAirFryer() {
        return "<br>" + airFryerLigado + "<br>";
    }
    
    public String assar(Salgado salgado){
        System.out.println("~Assando "+salgado.descricao()+"~");
        
        return "<br>~Assando "+salgado.descricao()+"~<br>";
    }
    
    public String fritar(Salgado salgado){
        System.out.println("~Fritando "+salgado.descricao()+"~");
        
        return "<br>~Fritando "+salgado.descricao()+"~<br>";
    }
    
    public String retirarMassa(){
        System.out.println("O salgado está pronto para consumo!\n");
        
        return "<br>O salgado está pronto para consumo!<br>";
    }
    
    public void desligar(){
        airFryer = null;
    }
    
}
