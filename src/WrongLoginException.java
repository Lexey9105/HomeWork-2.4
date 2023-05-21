public class WrongLoginException extends RuntimeException{
    public WrongLoginException(){
        super();
    }
    public WrongLoginException(String massage){
        super(massage);
    }
    public WrongLoginException(String massage,Throwable c){
        super(massage,c);
    }
    public  WrongLoginException(Throwable c){
        super(c);
    }
}
