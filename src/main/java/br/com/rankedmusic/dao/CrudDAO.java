
package br.com.rankedmusic.dao;

import br.com.rankedmusic.util.execption.ErroSistema;
import java.util.List;


public interface CrudDAO<E> { // E de entidade
    
    public void salvar(E entidade) throws ErroSistema;
    public void deletar(E entidade) throws ErroSistema;
    public List<E> buscar() throws ErroSistema;
}
