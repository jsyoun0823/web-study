package item26.generic;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Repository<E extends Entity>{

    private Set<E> entities;

    public Repository() {
        this.entities = new HashSet<>();
    }

    public Optional<E> findById(Long id) {
        return entities.stream().filter(a -> a.getId().equals(id)).findAny();
    }

    public void add(E entity) {
        this.entities.add(entity);
    }
}