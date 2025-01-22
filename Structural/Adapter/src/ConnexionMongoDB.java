public class ConnexionMongoDB implements IConnexionNoSQL{
    @Override
    public void connexion() {
        System.out.println("Conexion Con MongoDB");
    }

    @Override
    public String executeSentence() {
        return "Consulta MongoDB";
    }
}
