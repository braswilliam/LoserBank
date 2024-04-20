package br.loser.bank.exceptions;

public class ErroNoCNPJException extends RuntimeException{
    @Override
    public String getMessage() {
        return "O CNPJ deve ter 14 dígitos";
    }
}
