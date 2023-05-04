
/*Faça um programa para atender ao canal de ouvidoria do estado de Minas Gerais com
duas classes Usuário e Solicitação
 */
public class Atv9p1principal {
    public static void main(String[] args) {

        Atv9p3usuario usuario = new Atv9p3usuario();

        usuario.nomeUsuario = "Wendel Xavier";
        usuario.cpf = 123243098;
        usuario.telefoneUsuario = "31990348839";


        Atv9p2solicitacao solicitacao = new Atv9p2solicitacao();

        solicitacao.nomeSolicitante = "Benedito Silva";
        solicitacao.cpfSolicitante = "390.234.145-80";
        solicitacao.telefoneSolicitante = "(31) 9.8439-9489";
        solicitacao.problemaRelatado = "Soliciante" + solicitacao.nomeSolicitante + "realizou a ligação para reclamar" +
                " sobre os valores injustos das passagens de onibus, visto que o valor cobrado não condiz " +
                "com o serviço prestado aos clientes";
        solicitacao.solucaoProblema = "Abrir um manifesto sobre a reclamação relatada pelo cidadão";

        Atv9p2solicitacao.cadastrarSolicitacao();




    }
}
