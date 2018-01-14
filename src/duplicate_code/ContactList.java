package duplicate_code;

import java.util.LinkedList;

public class ContactList extends LinkedList<Person> {

    public ContactList() {
        super();
    }
    
    public LinkedList<Person> getList() {
        return this;
    }
    
    public Person getPersonById(int id) throws Exception {
        return get(getPositionById(id));
    }
    
    public void deletePersonById(int id) throws Exception {
        remove(getPositionById(id));
    }
    
    private Integer getPositionById(int id) throws Exception {
        int size = this.size();
        for(int i = 0; i < size; i++) {
            if(get(i).getId() == id) return i;
        }
        throw new Exception("Person not found");
    }
    
}
