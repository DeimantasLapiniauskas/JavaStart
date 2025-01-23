package org.example;

import itaphones.phone.AutomaticDialer;
import itaphones.phone.Phone;

public class PhoneAdapter implements Phone {

    private AutomaticDialer dialer;
    private String nmbr;

    public PhoneAdapter(AutomaticDialer dialer) {
        this.dialer = dialer;
    }

    public String dial() {
        return dialer.dial(this);
    }

    @Override
    public void dial(String s) {
        this.nmbr = s;
        //document why this method is empty
    }

    @Override
    public String getReponse() {
        return nmbr;
    }
}
