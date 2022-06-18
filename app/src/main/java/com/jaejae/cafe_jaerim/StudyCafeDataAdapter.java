package com.jaejae.cafe_jaerim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class StudyCafeDataAdapter extends RecyclerView.Adapter<StudyCafeDataAdapter.StudyCafeDataViewHolder> {

    private ArrayList<StudyCafeData> arrayList;
    private Context context;

    public StudyCafeDataAdapter(ArrayList<StudyCafeData> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public StudyCafeDataAdapter.StudyCafeDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 실제 listView가 adapter에 연결된 다음에 이쪽에서 viewHolder을 최초로 만들어낸다.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_itemlist, parent, false);
        StudyCafeDataViewHolder holder = new StudyCafeDataViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudyCafeDataAdapter.StudyCafeDataViewHolder holder, int position) {
        // 각 아이템 매칭
        Glide.with(holder.itemView)
                .load(arrayList.get(position).getProfile())
                .into(holder.iv_profile);
        holder.tv_name.setText(arrayList.get(position).getName());
        holder.tv_operating_hours.setText(arrayList.get(position).getOperating_hours());
        holder.tv_wifi.setText(arrayList.get(position).getWifi());
        holder.tv_socket.setText(arrayList.get(position).getSocket());
        holder.tv_bathroom.setText(arrayList.get(position).getBathroom());
    }

    @Override
    public int getItemCount() {
        // 삼항 연산자
        return (arrayList != null ? arrayList.size() : 0);
    }

    public class StudyCafeDataViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_profile;
        TextView tv_name;
        TextView tv_operating_hours;
        TextView tv_wifi;
        TextView tv_socket;
        TextView tv_bathroom;

        public StudyCafeDataViewHolder(@NonNull View itemView) {
            super(itemView);
            this.iv_profile = itemView.findViewById(R.id.iv_image);
            this.tv_name = itemView.findViewById(R.id.tv_name);
            this.tv_operating_hours = itemView.findViewById(R.id.tv_operating_hours);
            this.tv_wifi = itemView.findViewById(R.id.tv_wifi);
            this.tv_socket = itemView.findViewById(R.id.tv_socket);
            this.tv_bathroom = itemView.findViewById(R.id.tv_bathroom);
        }
    }
}
