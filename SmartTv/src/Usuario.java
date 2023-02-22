public class Usuario {
    public static void main(String[] args) throws Exception {
        
        
        SmartTv tv = new SmartTv();
        // Status da SmartTV:

        System.out.println("Tv ligada ? " + tv.ligada);
        System.out.println("Canal Atual : " + tv.canal);
        System.out.println("Volume Atual : " + tv.volume);

        // Novo Status da SmartTv:

        tv.ligar();
        System.out.println(">>>>>LIGANDO A TV<<<<<");
        System.out.println("Tv ligada ? " + tv.ligada);

        // Mudando de canal 
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.aumentarCanal();

        tv.mudarCanal(11);
        System.out.println("TV BAHIA");
        tv.mudarCanal(4);
        System.out.println("SBT");

        tv.diminuirCanal();
        
        // Abaixando Volume 
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();


        // Aumentando Volume 
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        // Desligar Tv
        tv.desligar();
        System.out.println(">>>>>DESLIGANDO A TV<<<<<");
        System.out.println("Tv ligada ? " + tv.ligada);
    }
    }

