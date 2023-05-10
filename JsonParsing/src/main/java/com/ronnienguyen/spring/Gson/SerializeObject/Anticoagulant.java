package com.ronnienguyen.spring.Gson.SerializeObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anticoagulant {
    private String name;
    private String strength;
    private String dose;
    private String route;
    private String sig;
    private String pillCount;
    private String refills;
}
