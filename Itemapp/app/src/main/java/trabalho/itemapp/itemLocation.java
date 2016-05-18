package trabalho.itemapp;

import com.google.android.gms.maps.model.LatLng;

public class itemLocation  {

    private LatLng locale;

    public itemLocation(LatLng locale){
       this.locale = locale;
    }

    public LatLng getLocale(){
        return locale;
    }

    public void setLocale(LatLng locale) {
        this.locale = locale;
    }
}
