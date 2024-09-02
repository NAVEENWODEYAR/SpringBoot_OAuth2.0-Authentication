package com.jwt.oauth.modal;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author NaveenWodeyar
 * @date 02-09-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OAUTH_BOOKSTORE")
public class BookStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookStoreId;

    private String bookStoreName;

    private String bookStoreMail;

    private String bookStoreAddress;

    private String bookStorePhoneNumber;
}
