/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cliente.controle;

import br.com.cliente.bean.Cliente;
import br.com.cliente.bean.Funcionario;
import br.com.cliente.dao.ClienteDao;
import br.com.cliente.dao.FuncionarioDao;
import java.util.List;

/**
 *
 * @author hugo.gomes
 */
public class FuncionarioCT {

    public void insert(Funcionario f) {
        FuncionarioDao dao = new FuncionarioDao();
        dao.insert(f);
    }

    public void update(Funcionario f) {
        FuncionarioDao dao = new FuncionarioDao();
        dao.update(f);
    }

    public void delete(Funcionario f) {
        FuncionarioDao dao = new FuncionarioDao();
        dao.delete(f);
    }

    public Funcionario select(int i) {
        FuncionarioDao dao = new FuncionarioDao();
        Funcionario c = (Funcionario) dao.select(i);

        return c;
    }

    public List select() {
        FuncionarioDao dao = new FuncionarioDao();
        List c = dao.select();
        return c;
    }
    
    public Funcionario selectandname(String i) {
        FuncionarioDao dao = new FuncionarioDao();
        Funcionario c = (Funcionario) dao.selectandName(i);

        return c;
    }

}
