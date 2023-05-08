package com.crudprueba.democrud.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudprueba.democrud.model.UserModel;
import com.crudprueba.democrud.repository.userrepository;

@Service
public class usuarioService implements IUserService {

    @Autowired
    private userrepository userrepository;

    @Override
    public List<UserModel> findAll() {
        // TODO Auto-generated method stub
        List<UserModel> list;
        try {
            list = userrepository.findAll();
        } catch (Exception e) {
            throw e;
        }
        return list;
    }

    @Override
    public int save(UserModel user) {
        // TODO Auto-generated method stub
        int row;
        try {
            row = userrepository.save(user);
        } catch (Exception e) {
            throw e;

        }
        return row;
    }

    @Override
    public int update(UserModel user) {
        // TODO Auto-generated method stub
        int row;
        try {
            row = userrepository.update(user);
        } catch (Exception e) {
            throw e;

        }
        return row;
    }

    @Override
    public int deleteById(int id) {
        // TODO Auto-generated method stub
      int row;
      try {
        row = userrepository.deleteById(id);
      } catch (Exception e) {
        // TODO: handle exception
        throw e;

      }
      return row;

    }



 
    
}
