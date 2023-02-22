public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true; 
    }

    public void desligar(){
        ligada = false; 
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume da tv : " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume da tv : " + volume);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println(" DTV.Ar " + canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("DTV.Ar " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("DTV.Ar " + canal);
    }


}
