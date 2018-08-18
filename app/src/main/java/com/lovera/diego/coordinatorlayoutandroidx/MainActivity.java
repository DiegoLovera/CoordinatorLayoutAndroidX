package com.lovera.diego.coordinatorlayoutandroidx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MaterialButton buttonSimpleCoordinator = findViewById(R.id.button_simple_example);
        buttonSimpleCoordinator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), SimpleCoordinatorActivity.class));
            }
        });

        MaterialButton buttonIO = findViewById(R.id.button_io_example);
        buttonIO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), IOActivity.class));
            }
        });

        MaterialButton buttonMaterialUp = findViewById(R.id.button_material_up);
        buttonMaterialUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), MaterialUpProfile.class));
            }
        });

        MaterialButton buttonFlexibleSpace = findViewById(R.id.button_flexible_space);
        buttonFlexibleSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), FlexibleSpaceActivity.class));
            }
        });

        MaterialButton buttonSwipe = findViewById(R.id.button_swipe_behaviour);
        buttonSwipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), SwipeBehaviourActivity.class));
            }
        });
    }
}
