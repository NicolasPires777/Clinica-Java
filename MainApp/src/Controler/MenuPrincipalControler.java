/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import view.Agenda;
import view.MenuPrincipal;

/**
 *
 * @author ALUNOS
 */
public class MenuPrincipalControler {
    
    private final MenuPrincipal view;

    public MenuPrincipalControler(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        Agenda agenda = new Agenda();
        agenda.setVisible(true);
        //aa
    }
    
    
    
}
