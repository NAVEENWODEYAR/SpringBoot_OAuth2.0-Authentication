package com.jwt.oauth.repository;
/*
 * @author NaveenWodeyar
 * @date 02-09-2024
 */

import com.jwt.oauth.modal.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookStoreRepo extends JpaRepository<BookStore,Object> {
}
