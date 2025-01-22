public class User {
    private int permissionLevel; // 1- 5 . 5==admin

    public User(int permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    public int getPermissionLevel() {
        return permissionLevel;
    }

    public void setPermissionLevel(int permissionLevel) {
        this.permissionLevel = permissionLevel;
    }
}
