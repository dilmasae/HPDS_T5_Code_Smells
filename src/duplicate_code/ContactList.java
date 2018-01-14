package duplicate_code;

import java.util.LinkedList;

public class ContactList extends LinkedList<Person> {

    public ContactList() {
        super();
    }
    
    public LinkedList<Person> getList() {
        return this;
    }
    
    public Person getPersonById(int id) {
        for(Person person : this) {
            if(person.getId() == id) return person;
        }
        return null;
    }
    
    public void deletePersonById(int id) {
        for(Person person : this) {
            if(person.getId() == id) {
                this.remove(person);
                break;
            }
        }
        
    }
    
}
