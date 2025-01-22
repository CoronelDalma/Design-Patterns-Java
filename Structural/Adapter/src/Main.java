//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IConnexionSQL connexion = new DatabaseAdapter(new ConnexionMongoDB());
        //IConnexionSQL connexion = new ConnexionSQL();
        //IConnexionNoSQL connexion = new ConnexionMongoDB();
        connexion.connexion();

        String result = connexion.runQuery();
        System.out.println(result);
    }
}