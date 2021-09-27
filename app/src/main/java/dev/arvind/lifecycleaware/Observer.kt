package dev.arvind.lifecycleaware

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class Observer: LifecycleObserver {

    // If onCreate() method is get called in Activity then this method will be called in Observer()
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        Log.d("MAIN","Observer - onCreate")
    }

    // If onResume() method is get called in Activity then this method will be called in Observer()
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun onResume() {
        Log.d("MAIN","Observer - onResume")
    }

    // If onPause() method is get called in Activity then this method will be called in Observer()
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun onPause() {
        Log.d("MAIN","Observer - onPause")
    }

    // If onStop() method is get called in Activity then this method will be called in Observer()
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun onStop() {
        Log.d("MAIN","Observer - onStop")
    }

    // If onDestroy() method is get called in Activity then this method will be called in Observer()
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        Log.d("MAIN","Observer - onDestroy")
    }
}