package com.ronnienguyen.spring.Gson.SerializeObject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Diuretic {
    private String name;
    private String strength;
    private String dose;
    private String route;
    private String sig;
    private String pillCount;
    private String refills;
}
