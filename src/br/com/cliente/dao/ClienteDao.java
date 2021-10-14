package br.com.cliente.dao;

import br.com.cliente.bean.Cliente;
import br.com.cliente.utils.Conector;
import br.com.cliente.utils.IDao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hugo.gomes
 */
public class ClienteDao implements IDao{

    @Override
    public void insert(Object o) {
        // Convertendo o meu parametro em objeto cliente (c)
        Cliente c = (Cliente) o; 
        
        // Criando uma variavel com nome sql e estou aplicando uma instrução sql
        // Comando para inserir no banco de dados, pegando os dados do formulario
        String sql = "insert into cliente(nome, endereco, municipio, cep, tel, "
                    + "cel, cpf, cnpj, genero) values (?,?,?,?,?,?,?,?,?)";
        
        try {
             //Pegando os valores dos atributos do objeto Clinete e atribuir nos campos da tabela
            PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getEndereco());
            ps.setString(3, c.getMunicipio());
            ps.setString(4, c.getCep());
            ps.setString(5, c.getTelefone());
            ps.setString(6, c.getCelular());
            ps.setString(7, c.getCpf());
            ps.setString(8, c.getCnpj());
            ps.setString(9, c.getGenero());
            
            //Executar o preparedStatement
            ps.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        
        
        
    }

    @Override
    public void update(Object o) {
     // Convertendo o meu parametro em objeto cliente (c)
        Cliente c = (Cliente) o; 
        
        // Criando uma variavel com nome sql e estou aplicando uma instrução sql
        // Comando para atualizar no banco de dados, pegando os dados do formulario
        String sql = "update cliente set nome=?, endereco=?, municipio=?,cep=?, tel=?, cel=?, cpf=?,cnpj=?, genero=? where id = ?";
        
        try {
             //Pegando os valores dos atributos do objeto Clinete e atribuir nos campos da tabela
            PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
            ps.setString(1, c.getNome());
            ps.setString(2, c.getEndereco());
            ps.setString(3, c.getMunicipio());
            ps.setString(4, c.getCep());
            ps.setString(5, c.getTelefone());
            ps.setString(6, c.getCelular());
            ps.setString(7, c.getCpf());
            ps.setString(8, c.getCnpj());
            ps.setString(9, c.getGenero());
            ps.setInt(10, c.getId());
            
            //Executar o preparedStatement
            ps.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
    }

    @Override
    public void delete(Object o) {
          // Convertendo o meu parametro em objeto cliente (c)
        Cliente c = (Cliente) o; 
        
            
        // Criando uma variavel com nome sql e estou aplicando uma instrução sql
        // Comando para excluir no banco de dados, pelo campo da chave primaria
        String sql = "delete from cliente where id=?";
        
        try {
             //Pegando os valores dos atributos do objeto Clinete e atribuir nos campos da tabela
            PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
            ps.setInt(1, c.getId());

            
            //Executar o preparedStatement
            ps.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
            
        }
        
    }

    @Override
    public Object select(int i) {
       Cliente c = new Cliente();
       
       String sql = "select * from cliente where id=?";
       
        try {
            PreparedStatement ps = Conector.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                c.setNome(rs.getString("nome"));
                c.setEndereco(rs.getString("endereco"));
                c.setMunicipio(rs.getString("municipio"));
                c.setCep(rs.getString("cep"));
                c.setTelefone(rs.getString("tel"));
                c.setCelular(rs.getString("cel"));
                c.setCpf(rs.getString("cpf"));
                c.setCnpj(rs.getString("cnpj"));
                c.setGenero(rs.getString("genero"));
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return c;
    }

    @Override
    public List select() {
        
    }

    
}