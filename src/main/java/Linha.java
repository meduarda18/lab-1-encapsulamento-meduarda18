public class Linha {
  private Ponto inicio;  
  private Ponto fim;

  public Linha(Ponto inicio, Ponto fim){
    this.inicio = inicio;
    this.fim = fim;
  }

  public Ponto getInicio(){
    return inicio;
  }

  public void setInicio(Ponto inicio){
    this.inicio = inicio;
  }

  public Ponto getFim(){
    return fim;
  }

  public void setFim(Ponto fim){
    this.fim = fim;
  }

  public double getComprimento(){
    double deltaX = Math.pow((fim.getX() - inicio.getX()), 2);
    double deltaY = Math.pow((fim.getY() - inicio.getY()), 2);
    return Math.sqrt(deltaX + deltaY);
  }
}
