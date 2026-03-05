package feature.Presentation;

import feature.data.MemDataRepository;
import feature.data.MemLocalDataSource;
import feature.domain.AddPersonUseCase;
import feature.domain.PersonRepository;
import feature.domain.ViewPersonUseCase;

public class ViewPerson {

    PersonRepository personRepository;

    ViewPersonUseCase viewPersonUseCase = new ViewPersonUseCase((PersonRepository) new MemLocalDataSource(new MemDataRepository()));

    public static void viewPerson(){

    }

    AddPersonUseCase addPersonUseCase = new AddPersonUseCase((PersonRepository) new MemLocalDataSource(new MemDataRepository()));

    public static  void addPerson(){

    }

    public static void deletePerson(){

    }




}
