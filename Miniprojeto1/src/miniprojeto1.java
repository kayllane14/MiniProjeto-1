import java.util.Scanner;

public class miniprojeto1 {
    public static void main(String[] args) throws Exception {
        Scanner ESCOLHAS = new Scanner(System.in);
        
        System.out.println("Bem-vindo, leitor!");
        System.out.println("Preparado para decidir o futuro dessa história? cada decisão sua afetará diretamente na vida"+
        "do personagem, então tome cuidada e boa sorte, vamos começar!");

        PersonagemJoao João = new PersonagemJoao("João", 100);
       PersonagemJose José = new PersonagemJose("José",100);

   // CAPITULO 1

    Capitulo Capitulo1 = new Capitulo("Capitulo 1", 
    "Era uma vez dois amigos baderneiros, João e José eram o terror da vizinhaça, "+
        "por onde passavam, deixavam um rastro de bagunça e desordem. Certo dia, passaram em uma casa muito "+
        "assustadora, misteriosa e abandonada, ficaram intrigados, porém com medo, então desafiaram-se, quem " +
       "iria entrar primeiro.", 
    "1. João", 
    "2. José", 
    João, 100, 
    José, 100);

       Capitulo1.mostrar();
       int escolha = Capitulo1.escolher();

       if(escolha == 1){
        System.out.println("João perdeu no par ou impar e teve que entrar na casa asssutadora"+
         " sozinho.");
         João.porcentagemJoao(-60);}
       
         else if(escolha == 2){
         System.out.println("José perdeu no par ou impar e teve que entrar na casa assustadora "+
         "sozinho.");
         José.porcentagemJose(-50);}

      // CAPITULO 2

       Capitulo Capitulo2 = new Capitulo(null, 
       "Apesar de estar como muito medo, ele entrou na casa escura, deu algumas passos"+
       "e escutou um baruho.", 
       null, 
       null, 
       João, José);
            }
         }

    


         
    




    
