package com.ronnienguyen.spring.Gson.SerializeObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Medication {
    private List<AceInhibitor> aceInhibitors = new ArrayList<AceInhibitor>();
    private List<Antianginal> antianginal = new ArrayList<Antianginal>();
    private List<Anticoagulant> anticoagulants = new ArrayList<Anticoagulant>();
    private List<BetaBlocker> betaBlocker = new ArrayList<BetaBlocker>();
    private List<Diuretic> diuretic = new ArrayList<Diuretic>();
    private List<Mineral> mineral = new ArrayList<Mineral>();

}
