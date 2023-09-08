package com.droidfreshsquad.demo.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.droidfreshsquad.demo.ProfileItem;
import com.droidfreshsquad.demo.R;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.UserViewHolder> {
    private List<ProfileItem> profileItemList;

    public MyAdapter(List<ProfileItem> profileItemList) {
        this.profileItemList = profileItemList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        ProfileItem profile = profileItemList.get(position);
        if (profile == null) {
            return;
        }
        holder.textViewcaption.setText(profile.getName());
    }

    @Override
    public int getItemCount() {
        if (profileItemList != null) {
            return profileItemList.size();
        }
        return 0;
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewcaption;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewcaption = itemView.findViewById(R.id.textViewcaption);
        }
    }
}
