package Task4_TransportationCompany.cargo.repo;

import Task4_TransportationCompany.cargo.domain.Cargo;
import Task4_TransportationCompany.common.utils.ArrayUtils;

import java.util.Objects;


import static Task4_TransportationCompany.common.utils.ArrayUtils.copyArray;

public interface DeleteCargoById {

    int ARRAY_CAPACITY = 10;
    Cargo[] cargos = new Cargo[ARRAY_CAPACITY];

    static void deleteCargoById(long id) {

        Cargo[] out = new Cargo[cargos.length - 1];
        int index =-1;
        for(int i=0;i<cargos.length;i++){
            if(cargos[i].getId().equals(id)){
                index=i;
                break;
            }
        }
        System.arraycopy(cargos, 0, out, 0, index);
        System.arraycopy(cargos, index + 1, out, 0, cargos.length - index);
/*        cargos = out;*/
    }
}