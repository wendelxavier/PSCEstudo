public class Atv9p3usuario {
    static private int id;
    static String nomeUsuario;
    int cpf;
    String telefoneUsuario;
    private String senha;

    void cadastrarUsuario() {
        System.out.println("Nome do usuario: " + nomeUsuario);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefoneUsuario);
    }
    void fazerLogin(){
        System.out.println("ID usuario: " + id);
        System.out.println("Senha: " + senha);
    }
}
