package service;


import model.Usuario;

public class AutenticacaoPerfil extends AutenticacaoService {

    public AutenticacaoPerfil(Usuario usuario) {
        super(usuario);
    }

    @Override
    public String autenticar() {

        if(!usuario.getPerfil().equals(recurso.getPerfilNecessario())){
        return "Acesso negado ao recurso " + recurso.getNome();
    }
        return "Acessado";
}
