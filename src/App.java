import br.loser.bank.model.User;

public class App {
    public static void main(String[] args) throws Exception {
        
        User teste1 = new User("William");
        teste1.regiterClientePF("22222222222", "22222222");
        System.out.println(teste1.getTypeUser());


        User teste2 = new User("José Antônio Estivas");
        teste2.regiterClientePJ("22222222222222");
        System.out.println(teste2.getTypeUser());


        teste1.setDataNascimento("28/03/1986");
        System.out.println(teste1.getDataNascimento());
        System.out.println(teste1.getIdade());


    }
}
