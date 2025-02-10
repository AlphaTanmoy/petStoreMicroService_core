package com.store.core.model.superEntity;

import com.store.core.enums.DATA_STATUS;
import com.store.core.utils.GenerateUUID;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.ZonedDateTime;

@Data
@MappedSuperclass
public abstract class SuperEntityWithoutExpiry {

    @Id
    private String id = GenerateUUID.generateShortUUID();

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private ZonedDateTime createdDate = ZonedDateTime.now();

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DATA_STATUS dataStatus = DATA_STATUS.ACTIVE;
}
