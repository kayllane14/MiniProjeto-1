import java.util.Scanner;

public class Capitulo {
    String nome;
    String texto;
    String escolha1;
    String escolha2;
    PersonagemJoao personagemJoao;
    int porcentagemJoao;
    PersonagemJose personagemJose;
    int porcentagemJose;

    Capitulo(String nome,
    String texto,
    String escolha1,
    String escolha2,
    PersonagemJoao personagemJoao,
    int porcentagemJoao,
    PersonagemJose personagemJose,
    int porcentagemJose){

    this.nome = nome;
    this.texto = texto;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    this.personagemJoao = personagemJoao;
    this.porcentagemJoao = porcentagemJoao;
    this.personagemJose = personagemJose;
    this.personagemJose = personagemJose;
}

void mostrar() {
        System.out.println(this.nome);
        System.out.println(this.texto);
        System.out.println(" - " + this.escolha1);
        System.out.println(" - " + this.escolha2);
    }

int escolher() {

        int escolha = -1;
        if (escolha1 != null || escolha2 != null) {

            Scanner digitador = new Scanner(System.in);
            int escolhaDigitada = digitador.nextInt();

            if (escolhaDigitada == 1) {

                escolha = 1;
            } else if (escolhaDigitada == 2) {
                escolha = 2;
            }

        }
        return escolha;
    }
    
}