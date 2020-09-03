/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author marconesio
 */
public class dtoLogin {

    public String Login = "";
    public String Pwd = "";

    public void setLogin(String login) {
        this.Login = login;
    }

    public String getLogin() {
        return this.Login;
    }

    public void setSenha(String login, String senha) throws NoSuchAlgorithmException {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(login.getBytes(), 0, login.length());
            BigInteger login1 = new BigInteger(1, m.digest());
            login = String.format("%1$032X", login1);

            m.reset(); // <---- Reseta antes de fazer o password
            m.update(senha.getBytes(), 0, senha.length());
            BigInteger password1 = new BigInteger(1, m.digest());
            senha = String.format("%1$032X", password1);
        }catch(NoSuchAlgorithmException e){
            System.out.println(e.getMessage());
        }
        this.Pwd = senha;
    }

    public String getSenha() {
        return this.Pwd;
    }
}
