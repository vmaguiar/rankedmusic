
package br.com.rankedmusic.bean;

import br.com.rankedmusic.dao.MusicaDAO;
import br.com.rankedmusic.Musica;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;








@ManagedBean
@SessionScoped
public class MusicaBean extends CrudBean<Musica, MusicaDAO> {
    private MusicaDAO musicaDAO;

    @Override
    public MusicaDAO getDao() {
        if(musicaDAO == null){
            musicaDAO = new MusicaDAO();
        }
        return musicaDAO;
    }

    @Override
    public Musica criarNovaEntidade() {
        return new Musica();
    }
    
}
