package com.clientone.respository.impl;

import com.clientone.entity.User;
import com.clientone.respository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class UserRespositoryImpl implements UserRepository {


    private static Map<Long, User> UserMap;

    static {
        UserMap = new HashMap<Long, User>();
        UserMap.put(1L, new User(1L, "李四", "abc"));
        UserMap.put(2L, new User(2L, "李四1", "few"));
        UserMap.put(3L, new User(3L, "李3", "bvre"));
    }

    @Override
    public Collection<User> findAll() {
        return UserMap.values();
    }

    @Override
    public User findById(long id) {

        return UserMap.get(id);
    }

    @Override
    public void savrOrUpdate(User user) {
UserMap.put(user.getId(),user);
    }

    @Override
    public void deleteById(long id) {
UserMap.remove(id);
    }
}
