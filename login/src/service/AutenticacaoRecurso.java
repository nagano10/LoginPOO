package service;
import model.Recurso;
import model.Usuario;

public class AutenticacaoRecurso extends AutenticacaoService{

    public AutenticacaoRecurso(Recurso recurso, AutenticacaoService proximo) {
        super(recurso, proximo);
    }

    @Override
    public String autenticar(Usuario usuario, String senha, Recurso recurso) {
        if(!recurso.isAtivo()) {
            return "Recurso " + recurso.getNome() + " inativo";
        }
        return proximo.autenticar(usuario, senha, recurso);
    }

    @Override
    public boolean verificar() {
        return recurso.isAtivo();
    }
}
