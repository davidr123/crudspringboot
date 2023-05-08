package com.crudprueba.democrud.repository;

import java.util.List;

public interface Iuser {
    /**
     * @param <userModel>
     * @return
     */
    public <userModel> List<userModel> findAll();
    public <userModel> int save(userModel user);
    public <userModel> int update(userModel user);
    public int deleteById(int id);

}
