public class TesteControleRemoto {
    public static void main(String[]args){
        Controle c1=new Controle();
        c1.ligar();
        c1.aumantarVolume();
        c1.abrirMenu();

        Controle c2=new Controle();
            c2.ligar();
            c2.aumantarVolume();
            c2.abrirMenu();
            c2.abrirMenu();
    }
}
