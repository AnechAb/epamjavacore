package Task4_TransportationCompany.common.business.repo;

import Task4_TransportationCompany.common.business.domain.BaseEntity;

import java.util.List;

public final class CommonRepoHelper {

    private CommonRepoHelper() {

    }

    public static Integer findEntityIndexInArrayStorageById(BaseEntity[] data, long entityId) {
        for (int i = 0; i < data.length; i++) {
            if (Long.valueOf(entityId).equals(data[i].getId())) {
                return i;
            }
        }

        return null;
    }

/*    public static Integer findEntityIndexInCollectionStorageById(List<BaseEntity> data, long entityId) {
        for (int i = 0; i < data.size(); i++) {
            if (Long.valueOf(entityId).equals(data.get(i).getId())) {
                return i;
            }
        }

        return null;
    }*/
}