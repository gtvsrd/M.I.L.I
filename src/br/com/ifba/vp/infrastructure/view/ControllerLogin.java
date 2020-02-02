/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifba.vp.infrastructure.view;

import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 * @author gusta
 */
public class ControllerLogin implements ActionListener{
    private TelaLogin telaLogin;
    
    public ControllerLogin() throws IOException {
        this.telaLogin = new TelaLogin();
        
    }
}
