/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 *
 * @author ADS
 */
public class Agendamento {
    private int id;
    private Cliente cliente; // relacionamento entre classes
    private Servico servico; // relacionamento entre classes
    float valor;
    Date data; //import Date
    String observacao;  

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try{
            this.data = new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(data);
        } catch (ParseException ex){
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data, String observacao) {
        this(id,cliente,servico,valor,data);
        this.observacao = observacao;
    }
    
    

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public float getValor() {
        return valor;
    }

    public Date getData() {
        return data;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    
    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(data);
    }
        
    public String getobservacao() {
        return observacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setobservacao(String observação) {
        this.observacao = observação;
    }
}
