/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import Model.Usuario;
import view.login;
import Controler.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import view.MenuPrincipal;
import java.text.ParseException;
/**
 *
 * @author jeffe
 */
public class LoginControler {
    private final login view;
    private LoginHelper helper;
    
    public LoginControler(login view){
        this.view = view;
        this.helper  = new LoginHelper(view);
        
    }
    
    public void entrarNoSistema(){
        //pegar um usuario da view
        Usuario usuario = helper.obterModelo();
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if(usuarioAutenticado != null){
            MenuPrincipal menu = new MenuPrincipal();
            menu.setVisible(true);
            this.view.dispose();
        }else{
            view.exibeMensagem("Usuário ou senha inválidos");
        }
    }
     
   
    
}
