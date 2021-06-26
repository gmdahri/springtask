package com.example.springreact.Repository;

import com.example.springreact.Entities.UserInfo;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<UserInfo,Integer> {

}
