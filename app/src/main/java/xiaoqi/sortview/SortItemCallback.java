package xiaoqi.sortview;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by xiaoqi on 16/10/8.
 */
public class SortItemCallback extends ItemTouchHelper.Callback{
    IItemDrag itemDrag;

    public SortItemCallback(IItemDrag itemDrag){
        this.itemDrag = itemDrag;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int dragFlag = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
        int swipedFlag = ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT;
        return makeMovementFlags(dragFlag,swipedFlag);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        itemDrag.updateList(viewHolder.getAdapterPosition(),target.getAdapterPosition());
        itemDrag.notifyItemDrag(viewHolder.getAdapterPosition(),target.getAdapterPosition());
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

    }

}
