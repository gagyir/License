package com.example.gagyi.test;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by gagyi on 2017-10-29.
 */

public class AppAdapter extends ArrayAdapter<ApplicationInfo> {

    private List<ApplicationInfo> appList = null;
    private Context context;
    private PackageManager packageManager;

    public AppAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<ApplicationInfo> objects) {
        super(context, resource, objects);

        this.context = context;
        this.appList = objects;
        packageManager = context.getPackageManager();

    }

    @Override
    public int getCount(){
        return  ((null != appList) ? appList.size() : 0);
    }

    @Override
    public ApplicationInfo getItem(int position){

        return ((null != appList) ? appList.get(position) : null);
    }

    @Override
    public long getItemId(int postition){
        return postition;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = convertView;

        if(view == null){

            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.list_item,null);

        }

        ApplicationInfo data = appList.get(position);

        if(null != data){

            TextView appName = (TextView) view.findViewById(R.id.app_name);
            TextView packageName = (TextView) view.findViewById(R.id.app_package);
            ImageView iconView = (ImageView) view.findViewById(R.id.app_icon);

            appName.setText(data.loadLabel(packageManager));
            packageName.setText(data.packageName);
            iconView.setImageDrawable(data.loadIcon(packageManager));

        }

        return view;
    }
}
