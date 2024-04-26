public class Controle implements Controlador{
    //atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    //métodos
    public Controle(){
        this.ligado=false;
        this.volume=30;
        this.tocando=false;
    }
    public int getVolume() {
        return this.volume;
    }
    public void setVolume(int volume){
        this.volume=volume;
    }
    public boolean getLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado=ligado;
    }
    public boolean getTocando() {
        return this.tocando;
    }
    public void setTocando(boolean tocando){
        this.tocando=tocando;
    }
//Métodos da interface
//override sobrescreve métodos
    @Override
    public void ligar() {
      this.setLigado(true);
    }
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    //abrir menu significa mostra como o controle está no momento
    @Override
    public void abrirMenu() {
        System.out.println(" Está ligado : " + getLigado());
        System.out.println(" Está tocando : " + getTocando());
        if(getLigado()) {
            System.out.println(" Qual volume : " + getVolume());
        }
        for (int i=0; i<=this.getVolume();i++)
            System.out.printf("  %s %", i);
    }
    @Override
    public void fecharMenu() {
        System.out.println(" Menu fechado ");
    }
    @Override
    public void aumantarVolume() {
        if(getLigado()==true ){
             this.setVolume(this.getVolume()+1);
        }
    }

    @Override
    public void diminuirVolume() {
        if(getLigado()==true ){
            setVolume(this.getVolume()-1);
        }
    }
    @Override
    public void play() {
        if(getLigado()==true && !(this.getTocando())){
            this.setTocando(true);

        }
    }
    @Override
    public void pause() {
        if(getLigado()==true && this.getTocando()==true){
            this.setTocando(false);

        }
    }
    @Override
    public void ativarMudo() {
        if(getLigado()==true && getVolume()>0){
            this.setVolume(0);
         }
    }
    @Override
    public void desativarMudo() {
        if(getLigado()==true && getVolume()<=0){
            this.setVolume(30);
        }
    }
}


