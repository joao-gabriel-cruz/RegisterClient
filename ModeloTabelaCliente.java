/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_grade2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ckenn
 */
public class ModeloTabelaCliente extends AbstractTableModel {
   private static final int COLUNA_NOME = 0;
   private static final int COLUNA_TELEFONE = 1;
   private static final int COLUNA_EMAIL = 2;
   private static final int COLUNA_CEP = 3;
   private static final int COLUNA_CIDADE = 4;
   private static final int COLUNA_BAIRRO = 5;
   private static final int COLUNA_NUMERO = 6;
   private static final int COLUNA_LOGRADOURO = 7;
   private static final int COLUNA_ESTADO = 8;
   private static final int COLUNA_COMPLEMENTO = 9;
   
   private String colunas[] = new String[]{"Nome","Telefone","Email", "CEP", "Cidade", "Bairro", "Numero", "Logradouro", "Estado", "Complemento"};
   private ArrayList<Cliente> clientes;
   
   public ModeloTabelaCliente(ArrayList<Cliente> clientes){
       this.clientes = new ArrayList<Cliente>(clientes);
   }
   
   @Override
   public int getColumnCount(){
       return colunas.length;
   }
   
   @Override
   public int getRowCount(){
       return clientes.size();
   }
   
   @Override
   public String getColumnName(int indiceColuna){
       return colunas[indiceColuna];
   }
   
   @Override
   public boolean isCellEditable(int indiceLinha, int indiceColuna){
       return false;
   }
   
   @Override
   public Object getValueAt(int indiceLinha, int indiceColuna){
       Cliente cliente = clientes.get(indiceLinha);
       switch (indiceColuna){
           case COLUNA_NOME :
               return cliente.getNome();
            case COLUNA_TELEFONE:
               return cliente.getTelefone();
            case COLUNA_EMAIL:
               return cliente.getEmail();
            case COLUNA_CEP:
               return cliente.getCep();
            case COLUNA_BAIRRO:
               return cliente.getBairro();
            case COLUNA_CIDADE:
               return cliente.getCidade();
            case COLUNA_COMPLEMENTO:
               return cliente.getComplemento();
            case COLUNA_ESTADO:
               return cliente.getEstado();
            case COLUNA_LOGRADOURO:
               return cliente.getLogradouro();
            case COLUNA_NUMERO:
               return cliente.getNumero();  
       }
       return "";
   }
   
   @Override
   public void setValueAt(Object valor, int indiceLinha, int indiceColuna){
       Cliente cliente = clientes.get(indiceLinha);
       switch (indiceColuna){
           case COLUNA_NOME:
               cliente.setNome(valor.toString());
               break;
           case COLUNA_TELEFONE:
               cliente.setTelefone(valor.toString());
               break;
            case COLUNA_EMAIL:
               cliente.setEmail(valor.toString());
               break;
            case COLUNA_CEP:
               cliente.setCep(valor.toString());
               break;
            case COLUNA_BAIRRO:
                cliente.setBairro(valor.toString());
                break;
            case COLUNA_CIDADE:
                cliente.setCidade(valor.toString());
                break;
            case COLUNA_COMPLEMENTO:
                cliente.setComplemento(valor.toString());
                break;
            case COLUNA_ESTADO:
                cliente.setEstado(valor.toString());
                break;
            case COLUNA_LOGRADOURO:
                cliente.setLogradouro(valor.toString());
                break;
            case COLUNA_NUMERO:
                cliente.setNumero(valor.toString());
                break;
               
       }
   }
   
   public Cliente obterCliente(int indicePessoa){
       return clientes.get(indicePessoa);
   }
   
   public void incluirCliente(Cliente cliente){
       clientes.add(cliente);
       int ultimo = getRowCount()-1;
       fireTableRowsInserted (ultimo, ultimo);
   }
   
   public void atualizarCliente(int indiceCliente, Cliente cliente) {
       clientes.set(indiceCliente, cliente);
       fireTableRowsUpdated(indiceCliente, indiceCliente);
   }
   
   public void excluirCliente(int indiceCliente){
       clientes.remove(indiceCliente);
       fireTableRowsDeleted(indiceCliente, indiceCliente);
   }
   
   
}
