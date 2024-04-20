package br.loser.bank.exceptions;

public class ErroNoRGException extends RuntimeException{
    
    @Override
    public String getMessage() {
        return "O RG tem que possuir 8 caracteres";
    }
}
