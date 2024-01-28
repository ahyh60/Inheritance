import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Store {
    private ArrayList<CISItem> cisItems = new ArrayList<CISItem>();
    public void addBook(Book book) {
        cisItems.add(book);
    }
    public ArrayList<CISItem> getItems() {
        return cisItems;
    }

    public void addPhone(Phone phone){
        cisItems.add(phone);
    }
    public void updatePhonesLocation(String location){
        for(int i = 0; i < cisItems.size()-1; i++){
            if(cisItems.get(i).getClass() == Phone.class){
                cisItems.get(i).setLocation(location);
            }
        }

    }
    public ArrayList<CISItem> getAllPhones() {
        ArrayList<CISItem> phones = new ArrayList<CISItem>();
        for(int i = 0; i < cisItems.size()-1; i++){
            if(cisItems.get(i).getClass() == Phone.class){
                phones.add(cisItems.get(i));
            }
        }
        return phones;
    }
    public ArrayList<CISItem> getTypeItems(String itemType){
        ArrayList<CISItem> items = new ArrayList<>();

        for (int i = 0; i < cisItems.size()-1; i++) {
            if (itemType.equalsIgnoreCase(String.valueOf(cisItems.get(i).getClass()))) {
                items.add(cisItems.get(i));
            }
        }
        return items;
    }

    public void updateItems(String type, String property, String value) {
        type = capitalize(type);
        property = capitalize(property);
        value = capitalize(value);
        for (int i = 0; i < cisItems.size()-1; i++) {
            if (type.equalsIgnoreCase(cisItems.get(i).getClass().getSimpleName())) {
                try {
                    Method setterMethod = cisItems.get(i).getClass().getMethod("set" + (property), String.class);
                    setterMethod.invoke(cisItems.get(i), value);
                } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    private String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }
    public void showAllInfo(){
        for (int i = 0; i < cisItems.size()-1; i++) {
            System.out.println("location: "+ cisItems.get(i).getLocation()+" name: "+cisItems.get(i).getName()
                    +" price: "+cisItems.get(i).getPrice()+" description: "+cisItems.get(i).getDescription());
        }
    }

}



