package feature.data;

import feature.domain.Person;
import feature.domain.PersonRepository;

import java.util.ArrayList;

public class MemDataRepository implements PersonRepository {

    public MemDataRepository() {
    }

    @Override
    public ArrayList<Person> listPerson() {
        return null;
    }

    @Override
    public void add() {

    }


}
