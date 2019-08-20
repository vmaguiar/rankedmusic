
package br.com.rankedmusic.dao;

import br.com.rankedmusic.Musica;
import br.com.rankedmusic.util.FabricaConexao;
import br.com.rankedmusic.util.execption.ErroSistema;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class MusicaDAO implements CrudDAO<Musica>{
    
    @Override
    public void salvar(Musica musica) throws ErroSistema{
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps;
            if(musica.getId() == null){
            ps = conexao.prepareCall("INSERT INTO musica(nome, banda, nota) VALUES (?, ?, ?)");
            }
            else{
                ps = conexao.prepareStatement("update musica set nome=?, banda=?, nota=? where id=?");
                ps.setInt(4, musica.getId());
            }
            ps.setString(1, musica.getNome());
            ps.setString(2, musica.getBanda());
            ps.setInt(3, musica.getNota());
            ps.execute();
            FabricaConexao.fecharConexao();
        } 
        catch (SQLException ex) {
            throw new ErroSistema("Erro ao tentar salvar!", ex);
        }         
    }
    @Override
    public List<Musica> buscar() throws ErroSistema{
        try {
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps =conexao.prepareStatement("SELECT * FROM MUSICA");
            ResultSet resultSet = ps.executeQuery();
            List<Musica> musicas = new ArrayList<>();
            while(resultSet.next()){
                Musica musica = new Musica();
                musica.setId(resultSet.getInt("id"));
                musica.setNome(resultSet.getString("nome"));
                musica.setBanda(resultSet.getString("banda"));
                musica.setNota(resultSet.getInt("nota"));
                musicas.add(musica);
            }
            FabricaConexao.fecharConexao();
            return musicas;
        }
        catch (SQLException ex) {
            throw new ErroSistema("Erro ao tentar buscar lista!", ex);
        }
    }
    @Override
    public void deletar(Musica musica) throws ErroSistema{
        try{
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement ps = conexao.prepareStatement("delete from musica where id = ?");
            ps.setInt(1, musica.getId());
            ps.execute();
        }
        catch(SQLException ex){
            throw new ErroSistema("Erro ao deletar música!", ex);
        }
    }
}


