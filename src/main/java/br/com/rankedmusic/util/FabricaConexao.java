
package br.com.rankedmusic.util;

import br.com.rankedmusic.util.execption.ErroSistema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class FabricaConexao {
    private static Connection conexao;
    private static final String URL_CONEXAO = "jdbc:mysql://localhost/gerencia-musica?useTimezone=true&serverTimezone=UTC";
    private static final String USUARIO = "root";
    private static final String SENHA = "Segredinho13!";

    public static Connection getConexao() throws ErroSistema {
        if(conexao == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                    conexao = DriverManager.getConnection(URL_CONEXAO, USUARIO, SENHA);
                }
                catch (ClassNotFoundException ex) {
                    throw new ErroSistema("O Driver do banco de dados não foi encontrado!", ex);
                }
                catch (SQLException ex) {
                    throw new ErroSistema("Não foi possivel conectar ao banco de dados!", ex);
                }
            }
            return conexao;
        }
    
    public static void fecharConexao() throws ErroSistema {
        if(conexao != null){
            try {
                conexao.close();
                conexao = null;
            } 
            catch (SQLException ex) {
                throw new ErroSistema("Erro ao fechar a conexão com o banco de dados!", ex);
            }
        }
    }
}
