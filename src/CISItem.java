public class CISItem {
    private String name;
    private String location;
    private int price;
    private String description;


    public String getLocation() {
        return location;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String d) {
        description = d;
    }

    public void setLocation(String l) {
        location = l;
    }

    public void setName(String n) {
        name = n;
    }

    public void setPrice(int p) {
        price = p;
    }
}
