package com.crudprueba.democrud.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.crudprueba.democrud.model.UserModel;

public class userrepository implements Iuser{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public  List<UserModel> findAll() {
        // TODO Auto-generated method stub
        String SQL = "SELECT * FROM usuario;"; 
        return jdbcTemplate.query(SQL, BeanPropertyRowMapper.newInstance(UserModel.class));
    }


    @Override
    public <userModel> int save(userModel user) {
        String SQL = "INSERT INTO usuario VALUES(?,?,?,?,?)"; 
        return jdbcTemplate.update(SQL, new Object[]{((com.crudprueba.democrud.model.UserModel) user).getNombre(), ((com.crudprueba.democrud.model.UserModel) user).getApellido(), ((com.crudprueba.democrud.model.UserModel) user).getProfesion(), ((com.crudprueba.democrud.model.UserModel) user).getEdad()});   
    }

    @Override
    public <userModel> int update(userModel user) {
        String SQL = "UPDATE usuario SET nombre=?, apellido=?, profesion=?, edad=?"; 
        return jdbcTemplate.update(SQL, new Object[]{((com.crudprueba.democrud.model.UserModel) user).getNombre(), ((com.crudprueba.democrud.model.UserModel) user).getApellido(), ((com.crudprueba.democrud.model.UserModel) user).getProfesion(), ((com.crudprueba.democrud.model.UserModel) user).getEdad()});   
    }

    @Override
    public int deleteById(int id) {
        String SQL = "UPDATE usuario SET nombre=?, apellido=?, profesion=?, edad=?"; 
        return jdbcTemplate.update(SQL, new Object[]{id});  
    }
    
}
