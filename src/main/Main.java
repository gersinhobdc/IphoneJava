package main;

import Funcionalidades.AparelhoTelefonico;
import Funcionalidades.NavegadorInternet;
import Funcionalidades.ReprodutorMusical;
import Operacoes.Op;

public class Main {
    public static void main(String[] args) {

        ReprodutorMusical reprodutor = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();

        Op.realizarOperacaoReprodutor(reprodutor, "tocar", "música");
        Op.realizarOperacaoTelefone(telefone, "ligar");
        Op.realizarOperacaoNavegador(navegador, "exibirPagina", "http://www.example.com");
    }
}

