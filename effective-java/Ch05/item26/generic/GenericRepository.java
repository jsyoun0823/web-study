package item26.generic;

import java.util.Optional;
import java.util.Set;

public class GenericRepository {

    private Set<Entity> entities;

    public GenericRepository(Set<? extends Entity> set) {
        this.entities = (Set<Entity>) set;
    }

    public Optional<? extends Entity> findById(Long id) {
        return entities.stream().filter(a -> a.getId().equals(id)).findAny();
    }

    public void add(Entity entity) {
        this.entities.add(entity);
    }
}