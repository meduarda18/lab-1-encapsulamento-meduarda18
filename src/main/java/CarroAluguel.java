public class CarroAluguel{
  private float valorPorKm;
  private int distancia;
  private boolean disponivel;
  private boolean sinistro;
  private float debito;

  public CarroAluguel(float valorPorKm){
    this.valorPorKm = valorPorKm;
    this.disponivel = true;
    this.sinistro = false;
    this.debito = 0;
    this.distancia = 0;
  }

  public float getValorPorKm(){
    return valorPorKm;
  }

  public void setValorPorKm(float valorPorKm){
    this.valorPorKm = valorPorKm;
  }

  public float getDistanciaPercorrida(){
    return distancia;
  }

  public void setDistanciaPercorrida(int distancia){
    this.distancia = distancia;
  }

  public boolean isDisponivel(){
    return disponivel;
  }

  public boolean hasSinistro(){
    return sinistro;
  }

  public void setSinistro(boolean sinistro){
    this.sinistro = sinistro;
  }

  public float getDebito(){
    float debitoAtual = valorPorKm * distancia;
    
    if(sinistro){
      float percentual = debitoAtual * 0.6f;
      debitoAtual += percentual;
      this.sinistro = false;
    }
    return debitoAtual;
    }
    
  

  public void alugar(){
    if (!disponivel){
      throw new CarroIndisponivelException("O carro está indisponível.");
    }
    disponivel = false;
    distancia = 0;
  }

  public void pagar(){
    if(disponivel){
      throw new CarroDisponivelException("O carro está disponível.");
    }else{
      debito = 0;
      distancia = 0;
    }
  }

  public void devolver(){
    if(disponivel){
      throw new CarroDisponivelException("O carro está disponível.");
    } 
    if(distancia > 0 && debito == 0){
      throw new CarroNaoPagoException("O carro não foi pago.");
    }

    disponivel = true;
    sinistro = false;
    distancia = 0;
  }


}