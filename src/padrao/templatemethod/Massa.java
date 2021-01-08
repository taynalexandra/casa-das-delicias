package padrao.templatemethod;

import java.util.ArrayList;
import java.util.List;
import painel.JFrameCasaDasDelicias;

public abstract class Massa {
    
    public String adicionarLeite(){
        System.out.println("Adicionar 1/2 litro de leite.");
        
        return "Adicionar 1/2 litro de leite.";
    }
    
    public String adicionarFarinha(){
        System.out.println("Adicionar 500 g de farinha de trigo (sem fermento).");
        
        return "Adicionar 500 g de farinha de trigo (sem fermento).";
    }
    
    public String adicionarMargarina(){
        System.out.println("Adicionar 1 colher (sopa) de margarina.");
        
        return "Adicionar 1 colher (sopa) de margarina.";
    }
    
    public String baterIngredientes(){
        System.out.println("Bater ingredientes.");
        
        return "Bater ingredientes";
    }
    
    public String adicionarSal(){
        System.out.println("Adicionar sal.");
        
        return "Adicionar sal";
    }
    
    public String descansarMassa(){
        System.out.println("~Massa descansando~");
        
        return "<br>~Massa descansando~<br>";
    }
    
    public abstract String recortarMassa();
    
    public abstract String dobrarMassa();
    
    public String prepararMassa(){
        String prepararMassa = "<html>";
        
        prepararMassa += adicionarLeite() + "<br>";
        prepararMassa += adicionarMargarina()+ "<br>";
        prepararMassa += baterIngredientes() + "<br>";
        prepararMassa += adicionarFarinha() + "<br>";
        prepararMassa += adicionarSal() + "<br>";
        prepararMassa += baterIngredientes() + "<br>";
        prepararMassa += descansarMassa() + "<br>";
        prepararMassa += recortarMassa() + "<br>";
        prepararMassa += dobrarMassa() + "<br>"; 
        
        return prepararMassa;
    }
}
