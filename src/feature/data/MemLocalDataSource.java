package feature.data;

import feature.domain.Person;

import java.util.ArrayList;
import java.util.Objects;

public class MemLocalDataSource {
    private ArrayList<Character> storage = new ArrayList<>();

    public MemLocalDataSource(MemDataRepository memDataRepository) {
    }


    public ArrayList<Person> findAll() {
        return storage;
    }

    public void save(Character character) {
        storage.add(character);
    }

    public void delete(String characterId) {
        storage.removeIf(character -> Objects.equals(character.getId(), characterId));
    }
}
