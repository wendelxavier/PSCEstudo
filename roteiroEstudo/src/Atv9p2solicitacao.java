public class Atv9p2solicitacao {
    private static int idSolicitacao;
    static String nomeSolicitante;
    static String telefoneSolicitante;
    static String cpfSolicitante;
    static String problemaRelatado;
    static String solucaoProblema;
    private static int idAtedente;
    private static int idAnalisaSolucionador;
    String statusSolicitacao;

    public static void cadastrarSolicitacao() {
        System.out.println("Nome do solicitante: " + nomeSolicitante);
        System.out.println("Telefone do solicitante: " + telefoneSolicitante);
        System.out.println("CPF do solicitante: " + cpfSolicitante);
        System.out.println("Relato do solicitante: " + problemaRelatado);
        System.out.println("Solução para o problema: " + solucaoProblema);
        System.out.println("ID do atentendente: " + idAtedente);
        System.out.println("Id do Analista responsavel: " + idAnalisaSolucionador);
        System.out.println("O ID da solicitação é: " + idSolicitacao);
    }
    void buscarSolitacao(){
        System.out.println("ID solicitação: " + idSolicitacao);
        System.out.println("ID atendente: " + idAtedente);
        System.out.println("ID analista responsavel: " +idAnalisaSolucionador);
    }
    void alterarSolicitacao(){
        System.out.println("Deseja alterar alguma informação no relato do solicitante: " +problemaRelatado);
        System.out.println("Deseja mudar o Analista Responsável: " +idAnalisaSolucionador);
        System.out.println("Nome do solicitante incorreto? " +nomeSolicitante);
        System.out.println("Mudar o status da solicitação: " +statusSolicitacao);

    }
}
