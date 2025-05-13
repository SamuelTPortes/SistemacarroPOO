public class Carro {
    private boolean carState = false;
    private int velocity, gear;

    public boolean isCarState() {
        return carState;
    }

    public int getVelocity() {
        return velocity;
    }

    public int getGear() {
        return gear;
    }

    public void setCarState(boolean carState) {
        this.carState = carState;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void turnOn(){
        setCarState(true);
    }

    public void turnOff(){
        setCarState(false);
    }

}

//Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes funções:
//Ligar o carro;
//Desligar o carro;
//Acelerar;
//diminuir velocidade;
//virar para esquerda/direita
//verificar velocidade;
//trocar a marcha
//Siga as seguintes regras na implementação
//
//Quando o carro for criado ele deve começar desligado, em ponto morto e com a sua velocidade em 0
//O carro desligado não pode realizar nenhuma função;
//Quando o carro for acelerado ele deve incrementar 1km na sua velocidade (pode chegar no máximo a 120km);
//Quando diminuir a velocidade do carro ele deve decrementar 1 km da sua velocidade (pode chegar no minimo a 0km);
//o carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no carro;
//A velocidade do carro deve respeitar os seguintes limites para cada velocidade
//se o carro estiver na marcha 0 (ponto morto) ele não pode acelerar
//se estiver na 1.ª marcha a sua velocidade pode estar entre 0km e 20km
//se estiver na 2.ª marcha a sua velocidade pode estar entre 21km e 40km
//se estiver na 3.ª marcha a sua velocidade pode estar entre 41km e 60km
//se estiver na 4.ª marcha a sua velocidade pode estar entre 61km e 80km
//se estiver na 5.ª marcha a sua velocidade pode estar entre 81km e 100km
//se estiver na 6.ª marcha a sua velocidade pode estar entre 101km e 120km
//O carro poderá ser desligado se estiver em ponto morto (marcha 0) e a sua velocidade em 0 km
//O carro só pode virar para esquerda/direita se a sua velocidade for de no mínimo 1km e no máximo 40km;
