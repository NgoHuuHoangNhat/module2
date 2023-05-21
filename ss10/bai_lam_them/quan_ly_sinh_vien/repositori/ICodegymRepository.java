package ss10.bai_lam_them.quan_ly_sinh_vien.repositori;

import ss10.bai_lam_them.quan_ly_sinh_vien.model.codegym_person.CodegymStudent;

import java.util.List;

public interface ICodegymRepository<E> {
    void add(E obj);

    List getAll();


    E getById(String checkId);

    void remove(E obj);
}

