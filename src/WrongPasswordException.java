public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(){
        super();
    }
    public WrongPasswordException(String massage){
        super(massage);
    }
    public WrongPasswordException(String massage,Throwable c){
        super(massage,c);
    }
    public  WrongPasswordException(Throwable c){
        super(c);
    }
}