package exceptions;

public class InvlidNumCalculateLitro extends Exception {
    public InvlidNumCalculateLitro(int l){
        super("i litri non posso essere " + l);
    }
}
