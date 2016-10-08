package xiaoqi.sortview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by xiaoqi on 16/10/8.
 */
public class SortAdapter extends RecyclerView.Adapter<SortAdapter.MyViewHolder> implements IItemDrag{

    List<Students> list;

    public SortAdapter(List<Students> list){
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return new MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.tv.setText(list.get(position).id);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void updateList(int originPos, int targetPos) {
        Collections.swap(list,originPos,targetPos);
    }

    @Override
    public void notifyItemDrag(int originPos, int targetPos) {
        notifyItemMoved(originPos, targetPos);
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tv;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.id);
        }
    }
}
