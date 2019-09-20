package com.example.a4contact_v1.model.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.a4contact_v1.R;
import com.example.a4contact_v1.model.Contact;

import java.util.List;

public class ContactAdapter extends ArrayAdapter<Contact> {

    private Context context;
    private int resource;
    private List<Contact> arrayContact;
    public ContactAdapter(@NonNull Context context, int resource, @NonNull List<Contact> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrayContact=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null)
        {
            viewHolder=new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_contact_listview,parent,false);
            viewHolder.imgbtnAvt= (ImageButton) convertView.findViewById(R.id.imgbtn_avt);
            viewHolder.imgbtnCall= (ImageButton) convertView.findViewById(R.id.imgbtn_call);
            viewHolder.tvInfor= (TextView) convertView.findViewById(R.id.tv_infor);
            convertView.setTag(viewHolder);
        }else{
            viewHolder=(ViewHolder) convertView.getTag();
        }
        Contact contact = arrayContact.get(position);
        viewHolder.tvInfor.setText(contact.getmName());
        viewHolder.imgbtnAvt.setBackgroundResource(R.drawable.avt);

        return convertView;
    }
    public  class ViewHolder{
        ImageButton imgbtnAvt;
        TextView tvInfor;
        ImageButton imgbtnCall;

    }
}
