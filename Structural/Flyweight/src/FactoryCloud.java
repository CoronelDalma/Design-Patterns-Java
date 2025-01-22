import java.util.HashMap;

public class FactoryCloud {
    private HashMap<CloudType, Cloud> cloudsMap;

    public FactoryCloud() {
        this.cloudsMap = new HashMap<CloudType, Cloud>();
    }

    public Cloud getCloud(CloudType type) {
        Cloud cloud = cloudsMap.get(type);

        if (cloud == null) {
            cloud = new Cloud(type, "nube.png", 100, 100 );
            this.cloudsMap.put(type, cloud);
        }

        return cloud;
    }

    public int countCloudsMap() {
        return cloudsMap.size();
    }
}
