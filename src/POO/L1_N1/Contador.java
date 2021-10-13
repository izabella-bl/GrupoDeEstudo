package POO.L1_N1;

public class Contador {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public  void zera(){
        this.num = 0;
    }

    public void encrementar(){
        this.num += 1;
    }

    @Override
    public String toString() {
        return "Numero final: "+this.num;
    }
}
