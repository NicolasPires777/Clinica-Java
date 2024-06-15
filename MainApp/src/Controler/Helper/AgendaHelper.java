/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler.Helper;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import view.Agenda;

/**
 *
 * @author nicol
 */
public class AgendaHelper implements iHelper {
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTable1().getModel();
        tableModel.setNumRows(0);
        
        for (Agendamento agendamento : agendamentos) {
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getCliente().getNome(),
                agendamento.getServico().getDescricao(),
                agendamento.getValor(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getobservacao()
            });
        }
        
    }

    public void preencherClientes(ArrayList<Cliente> clientes) {
        
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxC().getModel();
        
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
            
        }
    }

    public void preencherServicos(ArrayList<Servico> servicos) {
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxS().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }

    public Cliente obterCliente() {
        return (Cliente) view.getjComboBoxC().getSelectedItem();
    }
    
    public Servico obterServico() {
        return (Servico) view.getjComboBoxS().getSelectedItem();
    }

    public void setarValor(float valor) {
        view.getjTextField4().setText(valor+"");
    }

    @Override
    public Agendamento obterModelo() {
       String idString = view.getjTextField5().getText();
       int id = Integer.parseInt(idString);
       Cliente cliente = obterCliente();
       Servico servico = obterServico();
       String valorString = view.getjTextField4().getText();
       float valor = Float.parseFloat(valorString);
       String data = view.getjTextField2().getText();
       String hora = view.getjTextField3().getText();
       String dataHora = data + " " + hora;
       String observacao = view.getjTextField6().getText();
       
       Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora,observacao);
       return agendamento;
    }

    @Override
    public void limparTela() {
        view.getjTextField5().setText("");
        view.getjTextField2().setText("");
        view.getjTextField3().setText("");
        view.getjTextField6().setText("");
    }
    
    
}
