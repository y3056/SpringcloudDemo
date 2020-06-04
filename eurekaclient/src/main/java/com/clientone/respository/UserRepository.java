package com.clientone.respository;

import com.clientone.entity.User;

import java.util.Collection;

public interface UserRepository {
    public Collection<User> findAll();
    public User  findById(long id);
    public void  savrOrUpdate(User user);
    public  void deleteById(long id);
}
