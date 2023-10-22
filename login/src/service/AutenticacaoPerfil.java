package service;


import model.Recurso;
import model.Usuario;

public class AutenticacaoPerfil extends AutenticacaoService {

    public AutenticacaoPerfil(Usuario usuario, AutenticacaoService proximo) {
        super(usuario, proximo);
    }[]

    @Override
    public String autenticar(Usuario usuario, String senha, Recurso recurso) {

        if (!usuario.getPerfil().equals(recurso.getPerfilNecessario())) {
            return "Acesso negado ao recurso " + recurso.getNome();
        }

        return proximo.autenticar(usuario, senha, recurso);

    }

    @Override
    public boolean verificar() {
        return usuario.getPerfil().equals(recurso.getPerfilNecessario());
    }
}


