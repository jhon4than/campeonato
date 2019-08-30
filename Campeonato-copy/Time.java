public class Time
{
   private String nome;
   private Tecnico tecnico;
   private Jogador[] jogadores;
   
   public double mediaIdade(){
       int somaIdade=0;
       int qtdeJogador =0;
       for (int i=0;i < 11;i++){
           if (jogadores[i] != null){
           somaIdade += jogadores[i].geIdade();
           qtdeJogador++;
        }
       }
       return somaIdade/qtdeJogador++; //Pega o tamanho do vetor;
       
    }
   
   public double mediaAltura(){
       int somaAltura=0;
       int qtdeJogador =0;
       for (int i=0;i<11;i++){
           if (jogadores[i] != null){
           somaAltura += jogadores[i].getAltura();
           qtdeJogador++;
        }
       }
       return somaAltura/qtdeJogador++;
    }
  
    public double valorFolhaPagamento(){
       double somaPagamento =0;
       somaPagamento += tecnico.getSalario();
       for (int i=0; i < jogadores.length; i++){
        somaPagamento += jogadores[i].getSalario();
        }
       return somaPagamento;
    }
    
   public Jogador getJogadorMaiorSalario(){
       return null;
    }
    
   public Time(String Nome){
       this.nome=nome;
       jogadores = new Jogador[11];
    }
   
   public void setNome(String nome){
       this.nome = nome;
    }
   
   public String getNome(){
       return this.nome;
    }
    
    public void setTecnico(Tecnico tecnico){
       this.tecnico = tecnico;
    }
   
   public Tecnico getTecnico(){
       return this.tecnico;
    }
    
   // 
   // public void setJogadores(Jogador[] jogadores){
   //  this.tecnico = tecnico;
   //}
   public void addJogador(int posicao, Jogador jogador){
       
     jogadores[posicao]= jogador;
   }
   
   public Jogador[] getJogadores(){
       return this.jogadores;
    } 
}
