package br.loser.bank.exceptions;

public class ErroNoCPFException extends RuntimeException{


    @Override
    public String getMessage() {
        return "O CPF tem que ter 11 digitos";
    }


}
