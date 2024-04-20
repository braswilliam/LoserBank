package br.loser.bank.model;

import java.util.Date;

import br.loser.bank.exceptions.ErroNoCNPJException;
import br.loser.bank.exceptions.ErroNoCPFException;
import br.loser.bank.exceptions.ErroNoRGException;

public class User {

    private String name;
    private String numeroDoDocumento;
    private String rg;
    private Date dataNascimento;
    private TypeUser typeUser;

    // contructor:
    public User() {
    }
    
    public User(String name) {
        this.name = name;
    }

    //funções personalizadas:
    public void regiterClientePF(String CPF, String RG) {
        // mudo o user para PF
        this.typeUser = TypeUser.PESSOA_FISICA;

        // Validar Tamanho do cpf e rg:
        if (CPF.length() != 11) {
            throw new ErroNoCPFException();
        }

        this.numeroDoDocumento = CPF;

        if (RG.length() != 8) {
            throw new ErroNoRGException();
        }
        this.rg = RG;

    }

    public void regiterClientePJ(String pessoaJuridica) {
        this.typeUser = TypeUser.PESSOA_JURIDICA;

        if (pessoaJuridica.length() != 14) {
            throw new ErroNoCNPJException();
        }

        this.numeroDoDocumento = pessoaJuridica;
    }


    //funções getters and seters:

    public String getName() {
        return name;
    }

    public String getNumeroDoDocumento() {
        return numeroDoDocumento;
    }

    public String getRg() {
        return rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public String getTypeUser() {
        if (typeUser.equals(TypeUser.PESSOA_FISICA)) {
           return "Pessoa Física" ;
        } else {
            return "Pessoa Juridica";
        }
    }

}
