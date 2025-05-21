public final class Carro {
    private boolean carState = false;
    private int velocity = 0, gear = 0;
    private boolean canChangeGear = false;

    private boolean isCarState() {
        return carState;
    }

    private void setCarState(boolean carState) {
        this.carState = carState;
    }

    private int getVelocity() {
        return velocity;
    }

    private int getGear() {
        return gear;
    }

    private void setGear(int gear) {
        this.gear = gear;
    }



    public void turnOn(){
        if(!isCarState()) {
            setCarState(true);
            if(isCarState()) System.out.println("Carro Ligado");
        }
    }

    public void turnOff(){
        if(isCarState()) {
            if (getGear() == 0 && getVelocity() == 0) setCarState(false);
            if (!isCarState()) System.out.println("Carro Desligado");
            else System.out.println("Carro ainda ligado, verifique sua marcha e sua velocidade");
        } else System.out.println("O carro já está desligado");
    }

    public void accelerate(){
        if(isCarState()){
        setCanChangeGear();
        if(getVelocity() <120 && canChangeGear && getGear() !=0)velocity+=5;
        else if(getGear() == 0) System.out.println("Saia do ponto morto para aumentar a velocidade");
        canChangeGear = false;
        System.out.println("Velocidade atual: " + getVelocity());
        } else System.out.println("Carro desligado! Impossível acelerar");
    }

    public void desAccelerate(){
        if(isCarState()) {
            setCanChangeGear();
            if(getVelocity() > 0 && canChangeGear) velocity--;
            else if(getVelocity() >= 120) velocity--;
            canChangeGear = false;
            System.out.println("Velocidade atual: " + getVelocity());
        } else System.out.println("Carro desligado! Impossível desacelerar");
    }

    public void turnRight(){
        if(isCarState()) {
            if (getVelocity() >= 1 && getVelocity() <= 40) System.out.println("Você virou para a direita");
            else System.out.println("Impossível virar nessa velocidade!");
        } else System.out.println("Carro desligado! Impossível virar");
    }

    public void turnLeft(){
        if (isCarState()){
        if(getVelocity() >= 1 && getVelocity() <=40) System.out.println("Você virou para a esquerda");
        else System.out.println("Impossível virar nessa velocidade!");
        } else System.out.println("Carro desligado! Impossível virar");
    }

    public void verifyVelocity(){
        System.out.println("Velocidade atual é: " + getVelocity());
    }

    public void changeGear(int gear) {
        if (isCarState()) {
            if (getGear() >= 0 && getGear() <= 6 && gear >=0 && gear <=6) {
                if (gear == getGear() + 1 || gear == getGear() - 1) {
                    setGear(gear);
                    canChangeGear = !canChangeGear;
                } else System.out.println("Não é possível pular marcha");
            }
        } else System.out.println("Carro desligado! Impossível trocar a marcha");
    }

    private void setCanChangeGear(){
        if(getGear() >= 0 && getGear() <=6){
            switch (gear){
                case 0:
                    if(getVelocity() >= 0) {
                        canChangeGear = true;
                    }
                    break;
                case 1:
                    if(getVelocity() >= 0 && getVelocity() < 20) canChangeGear = true;
                    else System.out.println("Mude a marcha para aumentar ou diminuir a velocidade");
                    break;
                case 2:
                    if(getVelocity() >= 21 && getVelocity() < 40) canChangeGear = true;
                    else System.out.println("Mude a marcha para aumentar ou diminuir a velocidade");
                    break;
                case 3:
                    if(getVelocity() >= 41 && getVelocity() < 60) canChangeGear = true;
                    else System.out.println("Mude a marcha para aumentar ou diminuir a velocidade");
                    break;
                case 4:
                    if(getVelocity() >= 61 && getVelocity() < 80) canChangeGear = true;
                    else System.out.println("Mude a marcha para aumentar ou diminuir a velocidade");
                    break;
                case 5:
                    if(getVelocity() >= 81 && getVelocity() < 100) canChangeGear = true;
                    else System.out.println("Mude a marcha para aumentar ou diminuir a velocidade");
                    break;
                case 6:
                    if(getVelocity() >= 101 && getVelocity() < 120) canChangeGear = true;
                    else{
                        System.out.println("Mude a marcha para aumentar ou diminuir a velocidade");
                    }
                    break;
            }
        }
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
//Quando diminuir a velocidade do carro ele deve decrementar 1 km da sua velocidade (pode chegar no mínimo a 0km);
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
