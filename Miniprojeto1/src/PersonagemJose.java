
public class PersonagemJose {

String nome; 
int vida;

PersonagemJose(String nome,int vida){

this.nome = nome;
this.vida = 100;
}

void porcentagemJose (int mudança){
    this.vida = this.vida + mudança;
    System.out.println("Após essa decisão, sua porcentagem de vida totaliza-se em: " + this.vida + "%.");

if (this.vida > 100){
    this.vida = 100;

} else if (this.vida <= 0){
    this.vida = 0;
    System.out.println("Você tomou péssimas decisões e foi de base, sinto muito, tente novamente, "+
    "quem sabe aprende a jogar!");
}
    

}


}
