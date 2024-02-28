package com.example.sso_test.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class gentokenModel {

    @Id
    private Date request_date;

    @Column
    private String tokenid;

    @Column
    private String ssotype;

    @Column
    private String systemid;

    @Column
    private String systemname;

    @Column
    private String systemtransactions;

    @Column
    private String systemprivileges;

    @Column
    private String systemusergroup;

    @Column
    private String systemlocationgroup;

    @Column
    private String userid;

    @Column
    private String userfullname;

    @Column
    private String userrdofficecode;

    @Column
    private String userofficecode;

    @Column
    private String clientlocation;

    @Column
    private String locationmachinenumber;

    
}
