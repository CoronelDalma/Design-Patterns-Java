public class Cloud {
    private CloudType type;
    private String image;
    private int PosX;
    private int posY;

    public Cloud(CloudType type, String image, int posX, int posY) {
        this.type = type;
        this.image = image;
        PosX = posX;
        this.posY = posY;
    }

    public CloudType getType() {
        return type;
    }

    public void setType(CloudType type) {
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPosX() {
        return PosX;
    }

    public void setPosX(int posX) {
        PosX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
}
