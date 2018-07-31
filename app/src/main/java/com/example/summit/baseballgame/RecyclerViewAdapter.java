import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.summit.baseballgame.RecyclerViewHolder;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ItemViewHolder> {
    ArrayList<ScoreRecycler> mItems;

    public RecyclerViewAdapter(ArrayList<ScoreItem> items) {
        mItems = items;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup)

}
