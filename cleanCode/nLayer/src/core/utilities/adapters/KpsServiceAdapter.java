package core.utilities.adapters;

import business.abstracts.PersonService;
import entities.Person;

public class KpsServiceAdapter implements PersonService {
    @Override
    public boolean checkPerson(Person person) {
        KpsService kpsService = new KpsService();
        return kpsService.checkPerson(person.getNationalIdentity(),person.getFirstName(),person.getLastName(),person.getYearOfBirth());
    }
}
