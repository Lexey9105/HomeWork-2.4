public class Main {

    public static String check( String login,String password,String confirmPassword){
        boolean truth=true;
        try {
            checkSign( login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Неправильно введен логин "+e.getMessage());truth=false;
        } catch (WrongPasswordException e) {
            System.out.println("Неправильно введен пароль "+e.getMessage());truth=false;
        }
if(truth==true){
    System.out.println("Все данные внесены успешно");};
        return "проверка завершена";}

    public static void checkSign(String login,String password,String confirmPassword)
            throws WrongLoginException,WrongPasswordException
    {
        boolean equalsPass=password.equals(confirmPassword);
        if (!equalsPass){throw new WrongPasswordException("Пароли должны совпадать");}
        char[] log=login.toCharArray();
        char[] pass=password.toCharArray();
        char [] test=new char[]{'q','w','e','r','t','y','u','i','o','p',
                'a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m',
                '1','2','3','4','5','6','7','8','9','0','_',};
        int l=0;
        int p=0;
        if (log.length>20)
        {throw  new WrongLoginException
                ("логин не должен превышать 20 знаков");}
        if (pass.length>20)
        {throw new WrongPasswordException
                ("пароль не должен превышать 20 знаков");}
        for (int b=0;b< log.length;b++){
            for(int i=0;i< test.length;i++)
                if (log[b]==test[i]){
                    l++;
                }
        }
        for (int b=0;b< pass.length;b++){
            for(int i=0;i< test.length;i++)
                if (pass[b]==test[i]){
                    p++;
                }
        }
        if(l!= log.length)
        {throw  new WrongLoginException
                ("Логин должен содержать только латинские буквы, цифры и знак подчеркивания");}
        if(p!= pass.length)
        {throw  new WrongPasswordException
                ("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания");}
    }

    public static void main(String[] args) {
check("dim{","pas1","pas1");
check("dim","pas1","pas2");
check("dim","pas-1","pas-1");
check("dim","pas1","pas1");
    }
}