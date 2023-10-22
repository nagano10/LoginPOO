package service;

import model.Recurso;
import model.Usuario;

public class AutenticacaoSenha extends AutenticacaoService {

    String senha;

    public AutenticacaoSenha(Usuario usuario, AutenticacaoService proximo) {
        super(usuario, proximo);
    }

    @Override
    public String autenticar(Usuario usuario, String senha, Recurso recurso) {

        if (!usuario.getSenha().equals(senha)) {
            return "Senha inválida";
        }
        return "Senha válida";
    }

    @Override
    public boolean verificar() {
        return usuario.getSenha().equals(senha);
    }

}