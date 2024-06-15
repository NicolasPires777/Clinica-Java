/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;
//@author RafaelNR
public class Main {
public static void main(String[] args){
String nome = "Rodrigo";
System.out.println(nome);
Servico servico = new Servico(1, "barba", 30);
System.out.println(servico.getDescricao());
System.out.println(servico.getValor());
Cliente cliente = new Cliente(1, "Jorge","Rua tesla 95", "95445866");
System.out.println(cliente.getNome());
Usuario usuario = new Usuario (1, "barbeiro", "senha");
System.out.println(usuario);
//Pessoa pessoa = new Pessoa (1, "Joao"); //ERRO Pessoa da classe abstract não pode ser instanciado
//System.out.println(usuario.getNome());
Agendamento agendamento = new Agendamento (1, cliente, servico, 30, "25/03/2024 11:20" , "nada");
//Coloque um break point nesta linha para verificar os valores dos objetos
System.out.println(agendamento.getCliente().getNome());//Retorna o Cliente e o nome
}
}