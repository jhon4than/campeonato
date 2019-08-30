public class Trabalhador
{
   private String nome;
   private double salario;
   
   public Trabalhador(String nome, double salario, int idade, double altura){
       this.nome=nome;
       this.salario=salario;
   }
   
   public String toString(){
       return "Nome :: "+nome+" salário :: R$"+ salario;
   }
   
   //public Trabalhador(){
   //
   //} CUIDADO PARA NAO ERRAR NA PROVA!!
  
   
   public Trabalhador(String nome,double salario){
       this.nome = nome;
       this.salario = salario;
   }
   
   public void setNome(String nome){
       this.nome = nome;
    }
   
   public String getNome(){
       return this.nome;
    }
    
   public void setSalario(double salario){
       if (salario >=0){
       this.salario = salario;
       }
   }
   
   public double getSalario(){
       return this.salario;
    }
}