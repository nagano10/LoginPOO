package model;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String senha;
    private String perfil;

    public Usuario() {
    }

    public Usuario(int id, String nome, String email, String senha, String perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.perfil = perfil;

    }//builder

    @java.lang.Override
    public java.lang.String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                ", perfil='" + perfil + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public class UsuarioBuilder {
        private int id;
        private String nome;
        private String email;
        private String senha;
        private String perfil;

        public UsuarioBuilder id(int id){
            this.id = id;
            return this;
        }

        public UsuarioBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        public UsuarioBuilder email(String email){
            this.email = email;
            return this;
        }
        public UsuarioBuilder senha(String senha){
            this.senha = senha;
            return this;
        }
        public UsuarioBuilder perfil(String perfil){
            this.perfil = perfil;
            return this;
        }

        public Usuario build(){
            return new Usuario(id, nome, email, senha, perfil);
        }



    }
    

}
