package com.example.sso_test.Service;

import com.example.sso_test.Model.gentokenModel;
import com.example.sso_test.Repository.gentokenRepository;
import com.example.sso_test.Request.CreateSSORequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class gentokenService {

    private final gentokenRepository gentokenRepository;

    @Autowired
    public gentokenService(gentokenRepository gentokenRepository) {
        this.gentokenRepository = gentokenRepository;
    }

    public gentokenModel createSSO(CreateSSORequest createSSORequest) {
        System.out.println(0);
        gentokenModel gentoken = gentokenModel.builder()
                .ssotype(createSSORequest.getSsotype())
                .systemid(createSSORequest.getSystemid())
                .systemname(createSSORequest.getSystemname())
                .systemtransactions(createSSORequest.getSystemtransactions())
                .systemprivileges(createSSORequest.getSystemprivileges())
                .systemusergroup(createSSORequest.getSystemusergroup())
                .systemlocationgroup(createSSORequest.getSystemlocationgroup())
                .userid(createSSORequest.getUserid())
                .userfullname(createSSORequest.getUserfullname())
                .userrdofficecode(createSSORequest.getUserofficecode())
                .userofficecode(createSSORequest.getUserofficecode())
                .clientlocation(createSSORequest.getClientlocation())
                .locationmachinenumber(createSSORequest.getLocationmachinenumber())
                .tokenid(createSSORequest.getTokenid())
                .build();
        System.out.println(1);
        return gentokenRepository.save(gentoken);
    }
}

