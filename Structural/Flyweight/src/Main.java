//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FactoryCloud factory = new FactoryCloud();

        for (int i = 0; i < 100; i++) {
            Cloud cloud = factory.getCloud(CloudType.Small);
        }

        for(int i = 0; i < 200; i++){
            Cloud cloud = factory.getCloud(CloudType.Medium);
        }

        for(int i = 0; i < 300; i++){
            Cloud cloud = factory.getCloud(CloudType.Big);
        }

        System.out.println(factory.countCloudsMap()); //<-- 3
    }
}