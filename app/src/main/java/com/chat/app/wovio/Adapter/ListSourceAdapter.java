package com.chat.app.wovio.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chat.app.wovio.Interface.ItemClickListener;
import com.chat.app.wovio.Model.WebRemote;
import com.chat.app.wovio.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Hp on 6/8/2018.
 */

class ListSouceViewHolde extends RecyclerView.ViewHolder
    implements  View.OnClickListener

{



    TextView source_title;
    CircleImageView circleimage;



    public ListSouceViewHolde(View itemView) {
        super(itemView);


        source_title = itemView.findViewById(R.id.sourceText);
        circleimage = itemView.findViewById(R.id.sourceImage);



    }

    ItemClickListener clickListener;

    public void setClickListener(ItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @Override
    public void onClick(View v) {
        clickListener.onClick(v, getAdapterPosition(),false);
    }
}


public class ListSourceAdapter extends RecyclerView.Adapter<ListSouceViewHolde> {

    private Context context;
    private WebRemote webRemote;


    public ListSourceAdapter(Context context, WebRemote webRemote) {
        this.context = context;
        this.webRemote = webRemote;
    }

    @Override
    public ListSouceViewHolde onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ListSouceViewHolde holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
