package com.store.core.model;

import com.store.core.enums.MICROSERVICE;
import com.store.core.enums.STATUS;
import com.store.core.model.superEntity.SuperEntityWithOutDataStatus;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "micro_service_check_logger")

public class MicroserviceCheckLogger extends SuperEntityWithOutDataStatus{
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    MICROSERVICE microservice;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    STATUS status;
}
