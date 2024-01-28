import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


class StoreTester {




    @org.junit.jupiter.api.Test
    public void addBookTest() {
        Store store = new Store();
        Book book = new Book();
        store.addBook(book);
        assertTrue(store.getItems().size()==1);
    }
    @org.junit.jupiter.api.Test
    public void  addBookAndAddPhoneTest() {
        Store store = new Store();
        Book book = new Book();
        Phone phone = new Phone();

        store.addBook(book);
        store.addPhone(phone);

        assertTrue(store.getItems().size()==2);
    }
    @org.junit.jupiter.api.Test
    public void  updatePhonesLocationTest() {
        Store store = new Store();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addPhone(phone3);

        store.updatePhonesLocation("Room 222");
        ArrayList<CISItem> phones = store.getAllPhones();
        for(CISItem somePhone: phones){
            assertEquals(somePhone.getLocation(), "Room 222");
        }
    }

    @org.junit.jupiter.api.Test
    public void  getItemsTest() {
        Store store = new Store();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Book phone3 = new Book();

        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addBook(phone3);

        store.updatePhonesLocation("Room 512");
        ArrayList<CISItem> phones = store.getTypeItems("phone");

        for(CISItem e: phones){
            assertTrue(e.getClass().getSimpleName().equals("Phone"));
        }
    }


    @org.junit.jupiter.api.Test
    public void  updateItems() {
        Store store = new Store();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Book book1 = new Book();

        store.addPhone(phone1);
        store.addPhone(phone2);
        store.addBook(book1);

        store.updateItems("phone","location","Room 512");

        for(CISItem e: store.getItems()){
            if(e.getClass().getSimpleName().equals("Phone")){
                assertTrue(e.getLocation().equals("Room 512"));
            }
        }
    }




}
