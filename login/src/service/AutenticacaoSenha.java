package service;

import model.Usuario;

public class AutenticacaoSenha extends AutenticacaoService {


    public AutenticacaoSenha(Usuario usuario) {
        super(usuario);
    }

    @Override
    public String autenticar() {

        if (!usuario.getSenha().equals(senha)) {
            return "Senha inválida";
        }
        return "Senha válida";
    }

}