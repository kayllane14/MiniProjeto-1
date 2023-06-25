import java.util.Scanner;

public class miniprojeto1 {
    public static void main(String[] args) throws Exception {
        Scanner ESCOLHAS = new Scanner(System.in);
        
        System.out.println("Bem-vindo, leitor!");
        System.out.println("Preparado para decidir o futuro dessa história? cada decisão sua afetará diretamente na vida"+
        "do personagem, então tome cuidada e boa sorte, vamos começar!");
        System.out.println("Era uma vez dois amigos baderneiros, João e José eram o terror da vizinhaça, "+
        "por onde passavam, deixavam um rastro de bagunça e desordem. Certo dia, passaram em uma casa muito "+
        "assustadora, misteriosa e abandonada, ficaram intrigados, porém com medo, então desafiaram-se, quem " +
       "iria entrar primeiro");

       
       Personagem João = new Personagem("João", 100);
       Personagem José = new Personagem("José",100);


       String INTERACAO1 = "Agora é com você leitor, quem perdeu no par ou impar?";
       INTERACAO1 += System.lineSeparator() + "1. João";
       INTERACAO1 += System.lineSeparator() + "2. Jóse";
       

       System.out.println(INTERACAO1);

       int ESCOLHA1 = ESCOLHAS.nextInt();

       if(ESCOLHA1 == 1){
        System.out.println("João perdeu no par ou impar e teve que entrar na casa asssutadora"+
         " sozinho.");
         João.porcentagem(-60);
        
         System.out.println("Apesar de estar como muito medo, ele entrou na casa escura, deu algumas passos"+
       "e escutou um baruho.");


       String INTERACAO2 = "Qual foi a reação dele ao ouvir o barulho?";

       INTERACAO2 += System.lineSeparator() + "1.Ele gritou muito alto";
       INTERACAO2 += System.lineSeparator() + "2.Ele correu e seu amigo lhe chamou de medroso";
       
       System.out.println(INTERACAO2);
       
       int ESCOLHA2 = ESCOLHAS.nextInt();

       if(ESCOLHA2 == 1){   
        
        System.out.println("Seu amigo escutou e correu para ajuda-lo.");
        João.porcentagem(-5);

        System.out.println("Assustados com o alto barulho, eles decidiram seguir juntos");
        
            String INTERACAO3 = "Depois de algum tempo andando na casa, o que eles viram?";
            
            INTERACAO3 += System.lineSeparator() + "1. Eles não viram nada e decidiram ir tomar um sorvete para encerrar"+
            "o dia.";
            INTERACAO3 += System.lineSeparator() + "2. Eles viram um fantasma.";
             System.out.println(INTERACAO3);

             int ESCOLHAFINAL = ESCOLHAS.nextInt();
             if (ESCOLHAFINAL == 2){
                System.out.println("O fantasma correu atrás dos dois garotos os assustando e os traumatizando, os meninos "+
                "sairam da casa desesperados e prometendo que nunca mais entrariam em outras casas abandonados na vida.");
                João.porcentagem(-10);
                }

                System.out.println("FIM!");
        
        } else if (ESCOLHA2 == 2 ){
        System.out.println("Ele sentiu-se humilhado e foi para casa, assim encerrando a aventura do dia.");
        João.porcentagem(-40);
        }
    }

       if(ESCOLHA1 == 2){
         System.out.println("José perdeu no par ou impar e teve que entrar na casa assustadora "+
         "sozinho.");
         José.porcentagem(-50);

         System.out.println("Apesar de estar como muito medo, ele entrou na casa escura, deu algumas passos"+
       "e escutou um baruho.");



       String INTERACAO2 = "Qual foi a reação dele ao ouvir o barulho?";

       INTERACAO2 += System.lineSeparator() + "1.Ele gritou muito alto";
       INTERACAO2 += System.lineSeparator() + "2.Ele correu e seu amigo lhe chamou de medroso";
       
       System.out.println(INTERACAO2);
       
       int ESCOLHA2 = ESCOLHAS.nextInt();

       if(ESCOLHA2 == 1){   
        
        System.out.println("Seu amigo escutou e correu para ajuda-lo.");
        José.porcentagem(-5);

        System.out.println("Assustados com o alto barulho, eles decidiram seguir juntos");
        
            String INTERACAO3 = "Depois de algum tempo andando na casa, o que eles viram?";
            
            INTERACAO3 += System.lineSeparator() + "1. Eles não viram nada e decidiram ir tomar um sorvete para encerrar"+
            "o dia.";
            INTERACAO3 += System.lineSeparator() + "2. Eles viram um fantasma.";
             System.out.println(INTERACAO3);

             int ESCOLHAFINAL = ESCOLHAS.nextInt();
             if (ESCOLHAFINAL == 2){
                System.out.println("O fantasma correu atrás dos dois garotos os assustando e os traumatizando, os meninos "+
                "sairam da casa desesperados e prometendo que nunca mais entrariam em outras casas abandonados na vida.");
                José.porcentagem(-10);
                }

                System.out.println("FIM!");
        
        } else if (ESCOLHA2 == 2 ){
        System.out.println("Ele sentiu-se humilhado e foi para casa, assim encerrando a aventura do dia.");
        José.porcentagem(-50);

        }

         }
            }}

    

    
    
         
    




    
