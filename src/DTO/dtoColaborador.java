/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marconesio
 */
public class dtoColaborador {

    public String id = "";
    public String Matricula = "";
    public String Nome = "";
    public String CPF = "";
    public String Barracao = "";
    public String Status = "";
    public DefaultTableModel tabelaColaborador;

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMatricula() {
        return this.Matricula;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNome() {
        return this.Nome;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return this.CPF;
    }
    public void setBarracao(String Barracao) {
        this.Barracao = Barracao;
    }

    public String getBarracao() {
        return this.Barracao;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    public String getID() {
        return this.id;
    }
    public void setID(String id) {
        this.id = id;
    }

    public String getStatus() {
        return this.Status;
    }
    public void setTabelaColaborador(DefaultTableModel dtm) {
        this.tabelaColaborador = dtm;
    }

    public DefaultTableModel getTabelaColaborador() {
        return this.tabelaColaborador;
    }
    
}
