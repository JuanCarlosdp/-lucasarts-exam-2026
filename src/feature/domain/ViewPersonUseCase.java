package feature.domain;

import feature.Presentation.ViewPerson;

public class ViewPersonUseCase {

    PersonRepository personRepository;

    public ViewPersonUseCase(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void execute(){

    }
}
