package com.store.core.model.superEntity;

import com.store.core.enums.DATA_STATUS;
import com.store.core.utils.GenerateUUID;
import jakarta.persistence.*;
import lombok.Data;

@Data
@MappedSuperclass
public abstract class SuperEntityWithIdAndState {

    @Id
    private String id = GenerateUUID.generateShortUUID();

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private DATA_STATUS dataStatus = DATA_STATUS.ACTIVE;
}
