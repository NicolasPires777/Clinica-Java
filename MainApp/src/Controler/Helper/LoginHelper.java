package Controler.Helper;

import Model.Usuario;
import view.login;


/**
 *
 * @author jeffe
 */
public class LoginHelper implements iHelper{

    private final login view;
    
    public LoginHelper (login view){
        this.view = view;
    }

    /**
     *
     * @return
     */
    public Usuario obterModelo() /*throws ParseException*/ {
         String nome = view.getjTextField1().getText();
         String senha = view.getjPasswordField1().getText();
         Usuario modelo = new Usuario (0, nome, senha); 
        return modelo;
    }
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getjTextField1().setText(nome);
        view.getjPasswordField1().setText(senha);
    }
    
   
    public void limparTela(){
        view.getjTextField1().setText("");
        view.getjPasswordField1().setText("");
    }
}