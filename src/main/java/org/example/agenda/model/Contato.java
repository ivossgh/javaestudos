package org.example.agenda.model;

public class Contato {
    private String idcon;
    private String nome;
    private String contato;
    private String local;

    public Contato(String idcon, String nome, String contato, String local){
        this.idcon = idcon;
        this.nome = nome;
        this.contato = contato;
        this.local = local;
    }

    public String getIcon(){
        return idcon;
    }

    public void setIdcon(String idcon){
        this.idcon = idcon;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getContato(){
        return contato;
    }

    public void setContato(String contato){
        this.contato = contato;
    }

    public String getLocal(){
        return local;
    }

    public void setLocal(String local){
        this.local = local;
    }
}
