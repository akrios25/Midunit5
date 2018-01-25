package nyc.c4q.midunit5assessment.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.midunit5assessment.R;
import nyc.c4q.midunit5assessment.model.User;
import nyc.c4q.midunit5assessment.viewholder.UserViewHolder;

/**
 * Created by c4q on 1/24/18.
 */

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private List<User> list;

    public UserAdapter(List<User> users){
        list = users;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
