package service;


import model.Usuario;

public class AutenticacaoPerfil extends AutenticacaoService {

    public AutenticacaoPerfil(Usuario usuario, AutenticacaoService proximo) {
        super(usuario, proximo);
    }

    @Override
    public String autenticar() {

        if (!usuario.getPerfil().equals(recurso.getPerfilNecessario())) {
            return "Acesso negado ao recurso " + recurso.getNome();
        }

        return proximo.autenticar();

    }

    @Override
    public boolean verificar() {
        return usuario.getPerfil().equals(recurso.getPerfilNecessario());
    }
}


