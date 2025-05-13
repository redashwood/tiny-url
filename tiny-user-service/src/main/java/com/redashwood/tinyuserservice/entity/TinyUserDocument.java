package com.redashwood.tinyuserservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document(collection = "TINY_USERS")
public class TinyUserDocument {

    @Id
    private UUID userId;

    private BasicInformation basicInformation;

    private Address address;

    private ContactInformation contactInformation;

    private Credentials credentials;

    private Date createdOn;

    private Date updatedOn;

    private boolean active;
}
