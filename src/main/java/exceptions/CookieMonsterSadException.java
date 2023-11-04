package exceptions;

public class CookieMonsterSadException extends Exception //this will be checked exception
{
    public CookieMonsterSadException(String message, int cookieCount){
        super(message + ". You cannot divide " + cookieCount + " cookies evenly amount 0 friends!");
    }
}
