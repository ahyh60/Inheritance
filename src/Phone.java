public class Phone extends ElectronicItem{
    private int screenSize;
    private String networkType;

    public int getScreenSize(){
        return screenSize;
    }

    public String getNetworkType(){
        return networkType;
    }

    public void setScreenSize(int s){
        screenSize = s;
    }

    public void setNetworkType(String n){
        networkType = n;
    }
}
