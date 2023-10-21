package Operacoes;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;

public class Op {
    public static void realizarOperacaoReprodutor(ReprodutorMusical reprodutor, String operacao, String argumento) {
        if (operacao.equals("tocar")) {
            reprodutor.tocar();
        } else if (operacao.equals("pausar")) {
            reprodutor.pausar();
        } else if (operacao.equals("selecionarMusica")) {
            reprodutor.selecionarMusica(argumento);
        } else {
            System.out.println("Operação inválida para Reprodutor Musical");
        }
    }

    public static void realizarOperacaoTelefone(AparelhoTelefonico telefone, String operacao) {
        if (operacao.equals("ligar")) {
            telefone.ligar();
        } else if (operacao.equals("atender")) {
            telefone.atender();
        } else if (operacao.equals("iniciarCorreioVoz")) {
            telefone.iniciarCorreioVoz();
        } else {
            System.out.println("Operação inválida para Aparelho Telefônico");
        }
    }

    public static void realizarOperacaoNavegador(NavegadorInternet navegador, String operacao, String argumento) {
        if (operacao.equals("exibirPagina")) {
            navegador.exibirPagina(argumento);
        } else if (operacao.equals("adicionarNovaAba")) {
            navegador.adicionarNovaAba();
        } else if (operacao.equals("atualizarPagina")) {
            navegador.atualizarPagina();
        } else {
            System.out.println("Operação inválida para Navegador na Internet");
        }
    }
}
	 

