package com.ronnienguyen.spring.JsonObject.SerializeObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AceInhibitor {
    private String name;
    private String strength;
    private String dose;
    private String route;
    private String sig;
    private String pillCount;
    private String refills;
}
