public class Enemy {
    private String image;
    private int posX;
    private int posY;
    private int lifeCount;

    public Enemy(String image, int posX, int posY, int lifeCount) {
        this.image = image;
        this.posX = posX;
        this.posY = posY;
        this.lifeCount = lifeCount;
    }

    // for prototype:
    // method1 -> generating a constructor. passing it an baseEnemy
    // and then modifying its other characteristics with the setters
    public Enemy(Enemy enemy) {
        this.setImage(enemy.getImage());
        this.setPosX(enemy.getPosX());
        this.setPosY(enemy.getPosY());
        this.setLifeCount(enemy.getLifeCount());
    }

    // for prototype:
    // method 2
    public Enemy clone() {
        //return new Enemy(this);
        return new Enemy(this.image, this.posX, this.posY, this.lifeCount);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getLifeCount() {
        return lifeCount;
    }

    public void setLifeCount(int lifeCount) {
        this.lifeCount = lifeCount;
    }
}
