package com.crudprueba.democrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudprueba.democrud.model.UserModel;
import com.crudprueba.democrud.model.UserResponse;
import com.crudprueba.democrud.repository.userrepository;
import com.crudprueba.democrud.service.IUserService;
import com.crudprueba.democrud.service.usuarioService;

import ch.qos.logback.core.status.Status;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin("*")
public class userController {
    
    @Autowired
    private usuarioService IUsuarioService;
    /**
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity<List<UserModel>> list(){
        var result = IUsuarioService.findAll();
        return new ResponseEntity(result, HttpStatus.OK);
        

    }

    @PostMapping("/save")
    public ResponseEntity<UserResponse> save(@RequestBody UserModel user){
        UserResponse userResponse = new UserResponse();
        int result = IUsuarioService.save(user);
        if(result==1){
            userResponse.setMessage("Item grabado con éxito");
        }
        return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK);

    }



    @PostMapping("/update")
    public ResponseEntity<UserResponse> update(@RequestBody UserModel user){
        UserResponse userResponse = new UserResponse();
        int result = IUsuarioService.update(user);
        if(result==1){
            userResponse.setMessage("Item actualizado con éxito");
        }
        return new ResponseEntity<UserResponse>(userResponse, HttpStatus.OK);

    }


    /**
     * @param id
     * @return
     */
    @GetMapping("/delete/{id}")
    public ResponseEntity<UserResponse> update(@PathVariable int id){
        UserResponse userResponse = new UserResponse();
        int result = IUsuarioService.deleteById(id);
        if(result==1){
            userResponse.setMessage("El usuario a sido eliminado con exito");
        }
        return new ResponseEntity<>(userResponse, HttpStatus.OK);

    }


}
