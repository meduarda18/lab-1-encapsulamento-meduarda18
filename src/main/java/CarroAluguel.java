public class CarroAluguel{
  private float valorPorKm;
  private float distanciaPercorrida;
  private boolean disponivel;
  private boolean sinistro;

  public CarroAluguel(float valorPorKm){
    this.valorPorKm = valorPorKm;
    this.disponivel = true;
    this.sinistro = false;
  }

  public float getValorPorKm(){
    return valorPorKm;
  }

  public void setValorPorKm(float valorPorKm){
    this.valorPorKm = valorPorKm;
  }

  public float getDistanciaPercorrida(){
    return distanciaPercorrida;
  }

  public void setDistanciaPercorrida(float distanciaPercorrida){
    this.distanciaPercorrida = distanciaPercorrida;
  }

  public boolean isDisponivel(){
    return disponivel;
  }

  public boolean hasSinistro(){
    return sinistro;
  }

  public void alugar(){
    if (!disponivel){
      throw new CarroIndisponivelException("O carro está indisponível");
    }
    disponivel = false;
  }


}