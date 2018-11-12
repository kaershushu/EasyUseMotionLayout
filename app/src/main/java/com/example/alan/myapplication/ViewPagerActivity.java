package com.example.alan.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class ViewPagerActivity extends AppCompatActivity {

    private MotionLayout mMotionLayout;
    int selectIndex = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        mMotionLayout = findViewById(R.id.motion_container);
        findViewById(R.id.v1).setOnClickListener(mOnClickListener);
        findViewById(R.id.v2).setOnClickListener(mOnClickListener);
        findViewById(R.id.v3).setOnClickListener(mOnClickListener);
        mMotionLayout.setTransitionListener(new TransitionListener() {
            @Override
            public void onTransitionChange(MotionLayout motionLayout, int i, int i1, float v) {

            }

            @Override
            public void onTransitionCompleted(MotionLayout motionLayout, int i) {

            }
        });
    }

    private OnClickListener mOnClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.v1){
                if (selectIndex == 0){
                    return;
                }
                mMotionLayout.setTransition(R.id.page2, R.id.page1);
                mMotionLayout.transitionToEnd();
                selectIndex = 0;
                return;
            }

            if (v.getId() == R.id.v2){
                if (selectIndex == 1){
                    return;
                }

                if (selectIndex == 0){
                    mMotionLayout.setTransition(R.id.page1,R.id.page2);
                }else if (selectIndex == 2) {
                    mMotionLayout.setTransition(R.id.page3, R.id.page2);
                }
                mMotionLayout.transitionToEnd();
                selectIndex = 1;
                return;
            }

            if (v.getId() == R.id.v3){
                if (selectIndex == 2){
                    return;
                }

                mMotionLayout.setTransition(R.id.page2, R.id.page3);
                mMotionLayout.transitionToEnd();
                selectIndex = 2;
            }
        }
    };
}
