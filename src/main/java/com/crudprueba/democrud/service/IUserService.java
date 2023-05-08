package com.crudprueba.democrud.service;

import java.util.List;

import com.crudprueba.democrud.model.UserModel;

public interface IUserService {
  /**
     * @param <userModel>
     * @return
     */
    public <userModel> List<userModel> findAll();

    public   int save(UserModel user);
        // TODO Auto-generated method stub
       
    
    public   int update(UserModel user);
        // TODO Auto-generated method st
    
    public  int deleteById(int id);
        // TODO Auto-generated method stub
    
    
        //
    
}
