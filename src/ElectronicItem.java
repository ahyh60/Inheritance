public class ElectronicItem extends CISItem{
    private int storageCapacity;
    private String model;
    private String maker;
    private String operatingSystem;

    public String getMaker() {
        return maker;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setMaker(String m) {
        maker = m;
    }

    public void setModel(String m) {
        model = m;
    }

    public void setOperatingSystem(String o) {
        operatingSystem = o;
    }

    public void setStorageCapacity(int s) {
        storageCapacity = s;
    }
}
