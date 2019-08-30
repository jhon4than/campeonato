public class Tecnico extends Trabalhador
{
  public Tecnico(){
      super("",0);
  }
  
  public Tecnico(String nome, double salario){
      super(nome,salario);//cria um objeto pai usando um construtor vazio;Substitui o de baixo.
      //this.setNome( nome );
      //this.setSalario(salario);
    }
  }

