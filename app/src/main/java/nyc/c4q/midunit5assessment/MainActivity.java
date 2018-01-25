package nyc.c4q.midunit5assessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import nyc.c4q.midunit5assessment.controller.UserAdapter;
import nyc.c4q.midunit5assessment.services.UserResponse;
import nyc.c4q.midunit5assessment.services.UserService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public static String BASE_URL = "https://randomuser.me/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        UserService userService = retrofit.create(UserService.class);
        Call<UserResponse> booksResponseCall = userService.getUsers("");
        booksResponseCall.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                Log.d("response", "onResponse: working"+ response.toString());

                userArrayList = response.body().getResults();
                userAdapter = new UserAdapter(userArrayList);
                recyclerView.setAdapter(userAdapter);
                recyclerView.setLayoutManager(layoutManager);
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                t.printStackTrace();
            }
        });
    }

}
