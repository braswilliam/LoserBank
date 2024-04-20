import br.loser.bank.model.User;

public class App {
    public static void main(String[] args) throws Exception {
        
        User teste = new User("William");
        teste.regiterClientePF("22222222222", "22222222");

        System.out.println(teste.getTypeUser());




    }
}
