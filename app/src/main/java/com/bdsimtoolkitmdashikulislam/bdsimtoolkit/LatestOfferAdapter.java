package com.bdsimtoolkitmdashikulislam.bdsimtoolkit;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LatestOfferAdapter extends  RecyclerView.Adapter<LatestOfferAdapter.LatestOfferViewHolder>{
    private Context context;
    List<LatestOffer>latestOffers;

    public LatestOfferAdapter(Context context, List<LatestOffer> latestOffers) {
        this.context = context;
        this.latestOffers = latestOffers;
    }

    @NonNull
    @Override
    public LatestOfferViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.gp_latest_offer_recycler,null);
        LatestOfferViewHolder holder = new LatestOfferViewHolder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull LatestOfferViewHolder holder, int position) {
        LatestOffer offer = latestOffers.get(position);

        holder.textView1.setText(offer.getTextView1());
        holder.textView2.setText(offer.getTextView2());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(offer.getImage(),null));
    }

    @Override
    public int getItemCount() {
      return  latestOffers.size();
    }

    class LatestOfferViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1,textView2;



        public LatestOfferViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageviewRecyler);
            textView1 = itemView.findViewById(R.id.textview1);
            textView2 = itemView.findViewById(R.id.textview2);
        }
    }
}
