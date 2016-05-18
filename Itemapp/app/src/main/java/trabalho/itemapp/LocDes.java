package trabalho.itemapp;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

/**
 * Created by Felipe on 17/05/2016.
 */
public class LocDes implements JsonDeserializer<Object> {
    @Override
    public Object deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonElement locale = json.getAsJsonObject();

        if( json.getAsJsonObject().get("locale") != null ){
            locale = json.getAsJsonObject().get("locale");
        }

        return ( new Gson().fromJson( locale, itemLocation.class ));
    }
}