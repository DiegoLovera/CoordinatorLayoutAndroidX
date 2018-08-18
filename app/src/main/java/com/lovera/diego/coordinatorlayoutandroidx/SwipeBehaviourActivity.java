package com.lovera.diego.coordinatorlayoutandroidx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.behavior.SwipeDismissBehavior;

public class SwipeBehaviourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_behaviour);

        final SwipeDismissBehavior swipe = new SwipeDismissBehavior();
        swipe.setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_ANY);
        swipe.setListener(new SwipeDismissBehavior.OnDismissListener() {
            @Override public void onDismiss(View view) {
                Toast.makeText(view.getContext(),
                        "Card swiped !!", Toast.LENGTH_SHORT).show();
            }

            @Override public void onDragStateChanged(int state) {}
        });

        CardView cardView = findViewById(R.id.swipe_card);
        CoordinatorLayout.LayoutParams coordinatorParams =
                (CoordinatorLayout.LayoutParams) cardView.getLayoutParams();
        coordinatorParams.setBehavior(swipe);
    }
}
