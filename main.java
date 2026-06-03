public class main{

    public static void main(String[] args) {
        login login1 = new login(12345, "senha123@#");
        login  login2 = new login(67890, "senha456@#");

        login1.exibirDados();
        System.out.println("Senha válida: " + login1.validarSenha("senha123@#"));

        login2.exibirDados();
        System.out.println("Senha válida: " + login2.validarSenha("senha456@#"));
    }
}

    

