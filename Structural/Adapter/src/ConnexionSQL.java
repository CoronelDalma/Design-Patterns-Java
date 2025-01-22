public class ConnexionSQL implements IConnexionSQL{
    public void connexion() {
        System.out.println("Connexion con MYSQL");
    }

    public String runQuery() {
        return "Consulta MYSQL";
    }
}
