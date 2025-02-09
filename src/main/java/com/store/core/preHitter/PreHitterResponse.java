package com.store.core.preHitter;

import com.store.core.enums.MICROSERVICE;
import com.store.core.enums.RESPONSE_TYPE;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreHitterResponse {
    RESPONSE_TYPE responseType;
    MICROSERVICE microservice;
}
