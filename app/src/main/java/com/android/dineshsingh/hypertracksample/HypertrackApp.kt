package com.android.dineshsingh.hypertracksample

import android.app.Application
import com.hypertrack.lib.HyperTrack

class HypertrackApp: Application(){
    override fun onCreate() {
        super.onCreate()
        HyperTrack.initialize(this, "pk_test_f840b2f584b632d4ef1451a7eb566d42b787bff7");
    }

}