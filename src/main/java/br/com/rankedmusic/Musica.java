
package br.com.rankedmusic;

import java.util.Objects;


public class Musica {
    private String nome;
    private String banda;
    private Integer nota;
    private Integer id;
    
    //GET's

    public String getNome() {
        return nome;
    }

    public String getBanda() {
        return banda;
    }

    public Integer getNota() {
        return nota;
    }

    public Integer getId() {
        return id;
    }
    
   
    //SET's

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Musica other = (Musica) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
}