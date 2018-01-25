package nyc.c4q.midunit5assessment.services;

import java.util.ArrayList;

import nyc.c4q.midunit5assessment.model.User;

/**
 * Created by c4q on 1/24/18.
 */

public class UserResponse {
    private ArrayList<User> results;
     public ArrayList<User> getResults(){
         return results;
     }
}
