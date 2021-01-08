package painel;

import padrao.facade.ProducaoFacade;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 * JFrame do Sistema.
 * 
 */
public class JFrameCasaDasDelicias extends JFrame implements ActionListener {

    private String salgado;

    //Define as propriedades da fonte das legendas
    Font grande = new Font("Arial", Font.BOLD, 30);

    //Labels de legenda
    JLabel legenda = new JLabel("Novo Pedido");
    JLabel legendaSalgado = new JLabel("Pedido");
    JLabel legendaPreparo = new JLabel("Preparo");
    
    //ComboBox com os salgados disponíveis
    JComboBox<String> combo = new JComboBox<String>();
    
    //Button para fazer um pedido
    JButton jb = new JButton("Fazer Pedido");
    
    //ImageIcon, Label e Panel da imagem de fundo 
    ImageIcon fundo = new ImageIcon(getClass().getResource("Fundo.png"));
    JLabel labelFundo = new JLabel();
    JPanel panelFundo = new JPanel();
    
    //Labels para mostrar os conteúdos
    JLabel labelSalgado = new JLabel();
    JLabel labelPreparo = new JLabel();
    
    
    
    public JFrameCasaDasDelicias() {

        setLayout(null);
   
        //Adicionando as Legendas no JFrame
        legenda.setFont(grande);
        legenda.setForeground(Color.white);
        legenda.setHorizontalAlignment(SwingConstants.CENTER);
        legenda.setVerticalAlignment(JLabel.NORTH);
        legenda.setBounds(290, 20, 300, 50);
        
        legendaSalgado.setFont(grande);
        legendaSalgado.setForeground(Color.white);
        legendaSalgado.setBounds(60, 100, 400, 100);
        
        legendaPreparo.setFont(grande);
        legendaPreparo.setForeground(Color.white);
        legendaPreparo.setBounds(580, 100, 400, 100);
        
        add(legenda);
        add(legendaSalgado);
        add(legendaPreparo);
        
        //Adicionando o ComboBox no JFrame
        combo.setBounds(280, 65, 203, 26);
        add(combo);
        
        combo.addItem("Escolha um Salgado");
        combo.addItem("Coxinha de Charque");
        combo.addItem("Salgadinho de Queijo");
        combo.addItem("Folhado de Frango");
        combo.addItem("Pastel de Belém");

        //Adicionando o JButton no JFrame
        jb.setBounds(490, 63, 110, 30);
        jb.addActionListener(this);
        add(jb);

        //Instanciando os Panels de conteúdo
        PanelConteudo panelPreparo = new PanelConteudo(this);
        PanelConteudo panelSalgado = new PanelConteudo(this);
        
        //Adicionando as labels nos panels de conteúdo
        panelSalgado.add(labelSalgado);
        panelPreparo.add(labelPreparo);
        
        //Adicionando os Panels de Conteúdos no JFrame
        panelSalgado.setBounds(60, 180, 300, 300);
        panelPreparo.setBounds(450, 180, 380, 300);
        add(panelSalgado);
        add(panelPreparo);
        
        //Adicionando a imagem de fundo no JFrame
        labelFundo.setIcon(fundo);
        labelFundo.setBounds(0, -4, 900, 600);
        panelFundo.add(labelFundo);
        panelFundo.setBounds(0, -4, 900, 600);
        add(panelFundo);

        setTitle("Casa das Delícias");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setVisible(true);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }

    public static void main(String[] args) {
        new JFrameCasaDasDelicias();
    }

    /**
     * Captura o evento do botão para verificar o salgado escolhido e prepará-lo.
     * @param e 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        this.salgado = String.valueOf(combo.getSelectedItem());

        preparaSalgado();
    }
    
    /**
     * Prepara o salgado escolhido.
     */
    public void preparaSalgado() {

        ProducaoFacade producao = new ProducaoFacade();

        switch (this.salgado) {
            case "Coxinha de Charque":
                //Altera a legenda de "Pedido" para o salgado escolhido
                legendaSalgado.setText(this.salgado);
                //Mostra a imagem do salgado escolhido
                this.labelSalgado.setIcon(new javax.swing.ImageIcon(getClass().getResource("coxinha.png")));
                
                String produzirCoxinha = producao.produzirCoxinhaDeCharque();
                //Mostra o preparo do salgado escolhido
                this.labelPreparo.setText(produzirCoxinha);
                
                JOptionPane.showMessageDialog(null, "Pedido Preparado!");
                break;

            case "Folhado de Frango":
                legendaSalgado.setText(this.salgado);
                this.labelSalgado.setIcon(new javax.swing.ImageIcon(getClass().getResource("folhado.png")));
                
                String produzirFolhado = producao.produzirFolhadoDeFrango();
                this.labelPreparo.setText(produzirFolhado);
                
                JOptionPane.showMessageDialog(null, "Pedido Preparado!");
                break;

            case "Salgadinho de Queijo":
                legendaSalgado.setText(this.salgado);
                this.labelSalgado.setIcon(new javax.swing.ImageIcon(getClass().getResource("salgadinho.png")));
                
                String produzirSalgadinho = producao.produzirSalgadinhoDeQueijo();
                this.labelPreparo.setText(produzirSalgadinho);
                
                JOptionPane.showMessageDialog(null, "Pedido Preparado!");
                break;

            case "Pastel de Belém":
                legendaSalgado.setText(this.salgado);
                this.labelSalgado.setIcon(new javax.swing.ImageIcon(getClass().getResource("pastel.png")));
                
                String produzirPastelDeBelem = producao.produzirPastelDeBelem();
                this.labelPreparo.setText(produzirPastelDeBelem);
                
                JOptionPane.showMessageDialog(null, "Pedido Preparado!");
                break;

            default:
            JOptionPane.showMessageDialog(null, "Por favor, selecione um salgado!");

        }

    }

}
