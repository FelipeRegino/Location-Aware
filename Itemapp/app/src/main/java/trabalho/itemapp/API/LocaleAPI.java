package trabalho.itemapp.API;

import retrofit.Call;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import trabalho.itemapp.itemLocation;

public interface LocaleAPI {
    @FormUrlEncoded
    @POST("CAMINHO/ALGO.JAVA")
    Call<itemLocation> saveLocale( @Field("method") String method, @Field("item") String itemJson);
}
