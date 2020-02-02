/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class RegraLogin extends GenericDAO{
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) { 
        
        
        
        
        // TODO add your handling code here:
        FuncionarioCaixaDAO fdao = new FuncionarioCaixaDAO();
        List <FuncionarioCaixa> FC = new ArrayList();
        
        long cpf = 0; //= Long.parseLong(jTextField1.getText());
        int senha = 0; //= Integer.parseInt(jPasswordField1.getText());
        int i = 2;
        
        try{
            
            cpf = Long.parseLong(jTextField1.getText());
            senha = Integer.parseInt(jPasswordField1.getText());
            
        }catch(NumberFormatException ex){
            
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!");
            i = 3;
            
        }
        
        try{
            for(FuncionarioCaixa F: fdao.Login()){
                
                
                if(F.getCPF() == cpf && F.getSenha() == senha){
                    i  = 1;
                }
                

            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros!");
        }
             
        if(i == 1 ){
            new TelaFuncionario().setVisible(true);
            this.dispose();
            
        }
        if(cpf == 12345678911L && senha == 1221){
            new TelaGerente().setVisible(true);
            this.dispose();
            i++;
        }
        if(i == 2){
            JOptionPane.showMessageDialog(null, "Usuario não cadastrado!");
        }
        
        
    }

    public RegraLogin() {
    }
}
