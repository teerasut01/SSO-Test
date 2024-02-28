package com.example.sso_test.Controller;

import com.example.sso_test.Model.gentokenModel;
import com.example.sso_test.Request.CreateSSORequest;
import com.example.sso_test.Service.gentokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class gentokencontroller {

    private final gentokenService gentokenService;

    @Autowired
    public gentokencontroller(gentokenService gentokenService) {
        this.gentokenService = gentokenService;
    }

    @PostMapping("/service/gentoken")
    public ResponseEntity<gentokenModel> createSSO(@RequestBody CreateSSORequest createSSORequest) {
        gentokenModel createdSSO = gentokenService.createSSO(createSSORequest);
        return ResponseEntity.ok(createdSSO);
    }
}
