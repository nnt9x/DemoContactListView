package com.bkacad.nnt.democontactlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<Contact> listContact;

    // Phương thức khơi tạo
    public MyAdapter(Context context, List<Contact> listContact) {
        this.context = context;
        this.listContact = listContact;
    }

    @Override
    public int getCount() {
        return listContact.size();
    }

    @Override
    public Object getItem(int position) {
        return listContact.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.contact_item, parent, false);
        }
        // Gán các giá trị
        TextView tvName, tvPhone;
        tvName = convertView.findViewById(R.id.tvName);
        tvPhone = convertView.findViewById(R.id.tvPhone);

        ImageView imgAvatar = convertView.findViewById(R.id.imgAvatar);
        imgAvatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,listContact.get(position).getName(),Toast.LENGTH_SHORT).show();
            }
        });

        // Đổ dữ liệu vào view
        tvName.setText(listContact.get(position).getName());
        tvPhone.setText(listContact.get(position).getPhone());

        return convertView;
    }
}
