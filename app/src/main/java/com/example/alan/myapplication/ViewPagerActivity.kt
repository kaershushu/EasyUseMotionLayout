package com.example.alan.myapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener

class ViewPagerActivity : AppCompatActivity() {

    private var mMotionLayout: MotionLayout? = null
    internal var selectIndex = 0

    private val mOnClickListener = OnClickListener { v ->
        if (v.id == R.id.v1) {
            if (selectIndex == 0) {
                return@OnClickListener
            }
            mMotionLayout!!.setTransition(R.id.page2, R.id.page1)
            mMotionLayout!!.transitionToEnd()
            selectIndex = 0
            return@OnClickListener
        }

        if (v.id == R.id.v2) {
            if (selectIndex == 1) {
                return@OnClickListener
            }

            if (selectIndex == 0) {
                mMotionLayout!!.setTransition(R.id.page1, R.id.page2)
            } else if (selectIndex == 2) {
                mMotionLayout!!.setTransition(R.id.page3, R.id.page2)
            }
            mMotionLayout!!.transitionToEnd()
            selectIndex = 1
            return@OnClickListener
        }

        if (v.id == R.id.v3) {
            if (selectIndex == 2) {
                return@OnClickListener
            }

            mMotionLayout!!.setTransition(R.id.page2, R.id.page3)
            mMotionLayout!!.transitionToEnd()
            selectIndex = 2
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        mMotionLayout = findViewById(R.id.motion_container)
        findViewById<View>(R.id.v1).setOnClickListener(mOnClickListener)
        findViewById<View>(R.id.v2).setOnClickListener(mOnClickListener)
        findViewById<View>(R.id.v3).setOnClickListener(mOnClickListener)
        mMotionLayout!!.setTransitionListener(object : TransitionListener {
            override fun onTransitionChange(motionLayout: MotionLayout, i: Int, i1: Int, v: Float) {

            }

            override fun onTransitionCompleted(motionLayout: MotionLayout, i: Int) {

            }
        })
    }
}
