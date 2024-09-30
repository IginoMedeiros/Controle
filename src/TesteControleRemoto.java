public class TesteControleRemoto {
    public static void main(String[]args){
        Controle c1=new Controle();
        c1.ligar();
        try{
            c1.diminuirVolume();
            //catch pegar
        }catch(NullPointerException e){
            System.out.println("desligado : ");
        }
        c1.diminuirVolume();
        c1.abrirMenu();

        Controle c2=new Controle();
            c2.ligar();
            c2.aumantarVolume();
            c2.abrirMenu();
            c2.abrirMenu();
    }
}
