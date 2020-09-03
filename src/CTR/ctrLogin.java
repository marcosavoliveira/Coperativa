/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

/**
 *
 * @author marconesio
 */
public class ctrLogin {
    DTO.dtoLogin login;
    DAO.daoLogin daol = new DAO.daoLogin();
    boolean status;
    public boolean logar(DTO.dtoLogin login){
        this.login = login;
        status=daol.logarUsuario(this.login);
        return status;
    }
}
