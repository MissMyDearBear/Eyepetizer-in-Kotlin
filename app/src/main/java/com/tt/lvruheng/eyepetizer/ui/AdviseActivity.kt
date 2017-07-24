package com.tt.lvruheng.eyepetizer.ui

import android.os.Bundle
import com.gyf.barlibrary.ImmersionBar
import com.tt.lvruheng.eyepetizer.R
import com.tt.lvruheng.eyepetizer.base.BaseActivity
import kotlinx.android.synthetic.main.activity_advise.*

/**
 * Created by lvruheng on 2017/7/11.
 */
class AdviseActivity:BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advise)
        ImmersionBar.with(this).transparentBar().barAlpha(0.3f).fitsSystemWindows(true).init()
        settoolbar()
    }

     fun settoolbar(){
         setSupportActionBar(toolbar)
         var bar = supportActionBar
         bar?.title = "意见反馈"
         bar?.setDisplayHomeAsUpEnabled(true)
         toolbar.setNavigationOnClickListener {
             onBackPressed()
         }
     }
}