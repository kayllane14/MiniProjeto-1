import java.util.Scanner;

public class miniprojeto1 {
    public static void main(String[] args) throws Exception {
        Scanner ESCOLHAS = new Scanner(System.in);

        System.out.println("Bem-vindo, leitor!");
        System.out.println(
                "Preparado para decidir o futuro dessa história? cada decisão sua afetará diretamente na vida" +
                        "do personagem, então tome cuidada e boa sorte, vamos começar!");

        Personagem João = new Personagem("João", 100);
        Personagem José = new Personagem("José", 100);

        // CAPITULO 1

        Capitulo Capitulo1 = new Capitulo("Capitulo 1",
                "Era uma vez dois amigos baderneiros, João e José eram o terror da vizinhaça, " +
                        "por onde passavam, deixavam um rastro de bagunça e desordem. Certo dia, passaram em uma casa muito "
                        +
                        "assustadora, misteriosa e abandonada, ficaram intrigados, porém com medo. Eles devem entrar na casa?",
                "1. Sim", "2. Não",
                João, José);

        Capitulo1.mostrar();
        int primeiraescolha = Capitulo1.escolher();

        if (primeiraescolha == 1) {
            System.out.println("João toma a frente e decide entrar na casa.");
            João.coragem(-20);

            // CAPITULO 2

            Capitulo Capitulo2 = new Capitulo("Capitulo 2", "De cara, João avista uma porta velha " +
                    "e chama José para ir até lá abrir para ver o que iriam achar. José recusa, com medo, e João zomba dele e"
                    +
                    " segue até a porta. Ao abrir, notam uma presença estranha na casa e arrepios toma de conta dos seus corpos."
                    +
                    " Eles devem seguir na casa?",
                    "1. Sim.",
                    "2. Fugir imediatamente.",
                    João, José);

            Capitulo2.mostrar();
            int segundaescolha = Capitulo2.escolher();

            if (segundaescolha == 1) {
                System.out.println(
                        "José tremia de medo e resolve ir embora, mesmo sendo zombado por João, que agora segue até a porta."
                                +
                                " Porém, essa foi uma péssima decisão!");
                System.out.println(
                        "João, para pagar de maioral, decide seguir na casa, mas ele não sabia que aquele lugar era amaldiçoado."
                                +
                                "Agora, ele nunca mais conseguirá sair de lá e está condenado a viver uma vida de alucinações.");
                João.coragem(-100);

            } else {
                System.out.println("Os pestinhas sairam correndo de lá e foram direto para casa, assustados." +
                        " No outro dia, já estavam tocando o terror novamente.");
                System.out.println("FIM!");
            }

        }

        else if (primeiraescolha == 2) {
            System.out.println("Apesar de curiosos, eles decidiram não entrar. Agora os pestinhas podem voltar" +
                    " aterrorizar a vizinhança.");
            System.out.println("FIM!");
        }

    }

}
