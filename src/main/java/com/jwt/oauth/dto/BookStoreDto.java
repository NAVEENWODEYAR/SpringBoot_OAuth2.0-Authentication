package com.jwt.oauth.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author NaveenWodeyar
 * @date 02-09-2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties
public class BookStoreDto {

    private Integer bookStoreId;

    private String bookStoreName;

    private String bookStoreMail;

    private String bookStoreAddress;

    private String bookStorePhoneNumber;
}
