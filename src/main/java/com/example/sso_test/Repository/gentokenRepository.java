package com.example.sso_test.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.sso_test.Model.gentokenModel;

public interface gentokenRepository extends JpaRepository<gentokenModel,String> {
    
}
