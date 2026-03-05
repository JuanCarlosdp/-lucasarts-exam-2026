package feature.domain;

import java.util.ArrayList;

public interface PersonRepository {
   ArrayList<Person> listPerson();
   void add();
}
