package com.ronnienguyen.spring.FastJackson.SerializeObject;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Root {
    private List<Medication> medications = new ArrayList<Medication>();
    private List<Lab> labs = new ArrayList<Lab>();
    private List<Imaging> imaging = new ArrayList<Imaging>();
}
