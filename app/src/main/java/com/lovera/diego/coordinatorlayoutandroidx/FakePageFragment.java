package com.lovera.diego.coordinatorlayoutandroidx;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FakePageFragment extends Fragment {
    private RecyclerView mRootView;

    public FakePageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mRootView = (RecyclerView) inflater.inflate(R.layout.fragment_page,
                container, false);
        mRootView.setLayoutManager(new LinearLayoutManager(container.getContext(),
                LinearLayoutManager.VERTICAL, false));
        return mRootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initRecyclerView();
    }

    private void initRecyclerView() {
        mRootView.setAdapter(new FakePageAdapter(10));
    }

    public static Fragment newInstance() {
        return new FakePageFragment();
    }

    private static class FakePageAdapter extends RecyclerView.Adapter<FakePageVH> {
        private final int numItems;

        FakePageAdapter(int numItems) {
            this.numItems = numItems;
        }

        @Override
        public FakePageVH onCreateViewHolder(ViewGroup viewGroup, int i) {
            View itemView = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.list_item_card, viewGroup, false);

            return new FakePageVH(itemView);
        }

        @Override
        public void onBindViewHolder(FakePageVH fakePageVH, int i) {
            // do nothing
        }

        @Override
        public int getItemCount() {
            return numItems;
        }
    }

    private static class FakePageVH extends RecyclerView.ViewHolder {
        FakePageVH(View itemView) {
            super(itemView);
        }
    }

}
