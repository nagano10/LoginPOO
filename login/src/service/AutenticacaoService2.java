package service;

import model.Recurso;
import model.Usuario;

public class AutenticacaoService2 extends AutenticacaoService{

    public AutenticacaoService2(Usuario usuario, AutenticacaoService proximo) {
        super(usuario, proximo);
    }

    public AutenticacaoService2(Recurso recurso, AutenticacaoService proximo) {
        super(recurso, proximo);
    }

    @Override
    public String autenticar(Usuario usuario, String senha, Recurso recurso) {
        return "teste";
    }

    @Override
    public boolean verificar() {
        return false;
    }
}
