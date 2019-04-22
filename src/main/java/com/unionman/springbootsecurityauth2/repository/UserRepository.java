package com.unionman.springbootsecurityauth2.repository;

import com.unionman.springbootsecurityauth2.entity.User;
import com.unionman.springbootsecurityauth2.repository.base.BaseRepository;

public interface UserRepository extends BaseRepository<User> {

    User findUserByAccount(String account);
}
