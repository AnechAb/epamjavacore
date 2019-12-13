package Task4_TransportationCompany.common.domain;

import Task4_TransportationCompany.IdGenerator;
import Task4_TransportationCompany.cargo.domain.Cargo;

public class Storage {
    private static final int ARRAY_CAPACITY = 3;

    private static Entity[] entities = new Entity[ARRAY_CAPACITY];
    private static int entityIndex = 0;


    public static void addEntity(Entity entity) {
        entity.setId(IdGenerator.generateId());
        entities[entityIndex] = entity;
        entityIndex++;

        if (entityIndex % (ARRAY_CAPACITY - 1) == 0) {
            Entity[] newEntities = new Entity[entityIndex + ARRAY_CAPACITY];
            copyEntityArray(entities, newEntities);
            entities = newEntities;
        }
    }

    private static void copyEntityArray(Entity[] src, Entity[] dest) {
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
    }

    public static void printAllEntities() {
        for (Entity entity : entities) {
            if (entity != null) {
                System.out.println(entity);
            }
        }
    }
/*    public static void getCargoByName(String name) {
        for (Entity entity : entities) {
            if (name.equals(Cargo.name)) {
                System.out.println(entity);
            }
        }
    }
    public static void getCargoById(Long id) {
        for (Entity entity : entities) {
            if (id.equals(Cargo.id)) {
                System.out.println(entity);
            }
        }
    }*/
}
