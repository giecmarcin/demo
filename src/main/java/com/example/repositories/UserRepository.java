package com.example.repositories;

import com.example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Serializable> {
    @Transactional
    @Modifying
    @Query("update _User u set u.name =:newName, u.age=:age where u.id =:id")
    int setNewName(@Param("newName") String name, @Param("age") int age, @Param("id")Long id);

    List<User> findByNameIgnoreCase(String name);

}
