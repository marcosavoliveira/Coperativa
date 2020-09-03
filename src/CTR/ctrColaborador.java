/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author marconesio
 */
public class ctrColaborador {    
    DAO.daoColaborador daocadColaborador = new DAO.daoColaborador();
    boolean status;
    public boolean inserirColaborador(DTO.dtoColaborador cadColaborador){        
        status=daocadColaborador.inserirColaborador(cadColaborador);
        return status;
    }
    public boolean listarColaborador(JTable tabela,DTO.dtoColaborador dtoColaborador1){        
        status = false;        
        try{  
            tabela.setModel(daocadColaborador.listarColaborador(dtoColaborador1.getTabelaColaborador()));       
            tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        status  = true;
        }catch(Exception e){
            System.err.println(e.getMessage()+" essa aqui");
            status = false;
        }        
        return status;
    }
    public boolean atualizarColaborador(DTO.dtoColaborador cadColaborador){        
        status=daocadColaborador.atualizarColaborador(cadColaborador);
        return status;            
    }
    
   public boolean excluirColaborador(DTO.dtoColaborador cadColaborador){        
        status=daocadColaborador.excluirColaborador(cadColaborador);
        return status;            
    }
}