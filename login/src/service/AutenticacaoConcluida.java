package service;
import model.Recurso;
import model.Usuario;

public class AutenticacaoConcluida extends AutenticacaoService{
    public AutenticacaoConcluida(Recurso recurso, AutenticacaoService proximo) {
        super(recurso, proximo);
    }

    @Override
    public String autenticar(Usuario usuario, String senha, Recurso recurso) {
        return "Acesso concedido ao recurso " + recurso.getNome();
    }

    @Override
    public boolean verificar() {
        return true;
    }
}
