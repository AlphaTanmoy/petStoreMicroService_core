package com.store.core.preHitter;

import com.store.core.enums.MICROSERVICE;
import com.store.core.enums.RESPONSE_TYPE;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/preHitter")
@RequiredArgsConstructor
public class PreHitter {

    @GetMapping()
    PreHitterResponse preHitter(){
        return new PreHitterResponse(
                RESPONSE_TYPE.SUCCESS,
                MICROSERVICE.AUTHENTICATION
        );
    }

}
