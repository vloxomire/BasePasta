package com.max.basepasta.Model;

public class ModelMasa {
    private Integer Id;
    private String MasaCorporal;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getMasaCorporal() {
        return MasaCorporal;
    }

    public void setMasaCorporal(String masaCorporal) {
        MasaCorporal = masaCorporal;
    }

    public ModelMasa(Integer id, String masaCorporal) {
        Id = id;
        MasaCorporal = masaCorporal;
    }
}
