public class login {

    private int login;
    private String senha;

    public login(int login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void exibirDados() {
        System.out.println("login: " + login);
        System.out.println("Senha: " + senha);
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }
}
