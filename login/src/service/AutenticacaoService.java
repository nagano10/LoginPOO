package service;

import model.Recurso;
import model.Usuario;

public abstract class AutenticacaoService {

    protected Usuario usuario;

    protected Recurso recurso;

    protected AutenticacaoService proximo;

    public AutenticacaoService(Usuario usuario, AutenticacaoService proximo) {
        this.usuario = usuario;
        this.proximo = proximo;
    }

    public AutenticacaoService(Recurso recurso) {this.recurso = recurso;}

    public abstract String autenticar();

    public final AutenticacaoService ou(AutenticacaoService proximo){

        if(verificar())
            return this;
        return proximo;

    }

    public abstract boolean verificar();
}
