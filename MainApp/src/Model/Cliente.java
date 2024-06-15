/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import static javax.swing.UIManager.get;

/**
 *
 * @author ADS
 */
public class Cliente extends Pessoa {
    private String endereco;
    private String cep;

    public Cliente(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String endereco, String cep) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.endereco = endereco;
        this.cep = cep;
    }

    public Cliente(int id, String endereço, String cep, String nome) {
        super(id, nome);
        this.endereco = endereço;
        this.cep = cep;
    }

    public String getEndereço() {
        return endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setEndereço(String endereço) {
        this.endereco = endereço;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }  
    
    @Override
    public String toString(){
        return getNome();
    }
}
