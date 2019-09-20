package com.example.a4contact_v1.model;

public class Contact {
    private String mName;
    private String mPhone;
    private int mAvt;


    public Contact(String mName, String mPhone, int mAvt) {
        this.mName = mName;
        this.mPhone = mPhone;
        this.mAvt = mAvt;
    }

    public String getmName() {
        return mName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public int getmAvt() {
        return mAvt;
    }

    public void setmAvt(int mAvt) {
        this.mAvt = mAvt;
    }

}
