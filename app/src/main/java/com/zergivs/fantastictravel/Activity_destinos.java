package com.zergivs.fantastictravel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Activity_destinos extends AppCompatActivity {



    private List<Destination> destinations;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView destinationImage;
        public TextView destinationName;

        public ViewHolder(View itemView) {
            super(itemView);
            destinationImage = itemView.findViewById(R.id.destinationImage);
            destinationName = itemView.findViewById(R.id.destinationName);
        }
    }

    public DestinationsAdapter(List<Destination> destinations) {
        this.destinations = destinations;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.destination_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Destination destination = destinations.get(position);
        holder.destinationImage.setImageResource(destination.getImageResourceId());
        holder.destinationName.setText(destination.getName());
    }

    @Override
    public int getItemCount() {
        return destinations.size();
    }
}