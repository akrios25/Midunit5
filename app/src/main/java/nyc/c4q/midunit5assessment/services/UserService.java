package nyc.c4q.midunit5assessment.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by c4q on 1/24/18.
 */

public interface UserService {
    @GET("?nat=us&inc=name,location,cell,email,dob,picture&results=20")
    Call<UserResponse> getUsers(@Query("api-key") String apiKey);
}
