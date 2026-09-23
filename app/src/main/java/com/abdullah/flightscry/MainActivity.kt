package com.abdullah.flightscry

import android.app.Activity
import android.os.Bundle

/** Shows a sample itinerary; flight data is deliberately static for this proof of concept. */
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

