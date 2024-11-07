package school.sptech;

public class Circulo extends Figura{
    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override public Double calcularArea(){
        Double retorno = (getRaio() * getRaio()) * Math.PI;
        return retorno;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
