package br.com.cliente.utils;

import java.util.List;

/**
 *
 * @author hugo.gomes
 */
public interface IDao {
    public void insert(Object o); //Responsavel para inserir
    public void update(Object o); //Responsavel para atualizar
    public void delete(Object o); //Responsavel para excluir
    public Object select(int i); //Responsavel para selecionar
    public List select(); //Reponsavel para selecionar em lista
}
