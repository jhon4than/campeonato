public class Jogador extends Trabalhador
{
   
   private int idade;
   private double altura;
   
   public Jogador(String nome, double salario, int idade, double altura){
       super(nome,salario);
       this.idade=idade;
       this.altura=altura;
   }
   
   public Jogador(){
       super("",0);
   }
   
   //Puxa o toString do Trabalhador @override
   public String toString(){
       return super.toString() +" Idade :: " +idade+" Altura :: " +altura;   
   }
   
   public void setIdade(int idade){
       if(idade>=0){
           this.idade = idade;
       }
   }
   
   public int geIdade(){
       return this.idade;
   }
    
   public void setAltura(double altura){
       if(altura>=0){
           this.altura = altura;
       }
   }
   
   public double getAltura(){
       return this.altura;
   }
   
   
   }
   