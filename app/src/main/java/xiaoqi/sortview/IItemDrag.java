package xiaoqi.sortview;

import java.util.List;

/**
 * Created by xiaoqi on 16/10/8.
 */
public interface IItemDrag {

    void updateList(int originPos, int targetPos);

    void notifyItemDrag(int originPos, int targetPos);
}
