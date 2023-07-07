
public class Personagem {

String nome; 
int vida;

Personagem(String nome,int vida){

this.nome = nome;
this.vida = 100;
}

void coragem (int mudança){
    this.vida = this.vida + mudança;
    System.out.println("Após essa decisão, a coragem totaliza-se em: " + this.vida + "%.");

if (this.vida > 100){
    this.vida = 100;

} else if (this.vida < 0){
    this.vida = 0;
    System.out.println("Não existe mais falta de coragem que te faça sair dessa...");
}
    

}


}
