public class DatabaseAdapter implements IConnexionSQL {
    private IConnexionNoSQL noSQL;

    public DatabaseAdapter(IConnexionNoSQL noSQL) {
        this.noSQL = noSQL;
    }

    @Override
    public void connexion() {
        this.noSQL.connexion();
    }

    @Override
    public String runQuery() {
        return this.noSQL.executeSentence();
    }
}
