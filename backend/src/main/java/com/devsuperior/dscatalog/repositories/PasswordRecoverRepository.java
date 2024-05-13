package com.devsuperior.dscatalog.repositories;

import com.devsuperior.dscatalog.entities.PasswordRecover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.Instant;
import java.util.List;

public interface PasswordRecoverRepository extends JpaRepository<PasswordRecover, Long> {

    @Query("Select obj FROM PasswordRecover obj WHERE obj.token = :token AND obj.expiration > :now")
    List<PasswordRecover> searchValidTokens(String token, Instant now);
}
