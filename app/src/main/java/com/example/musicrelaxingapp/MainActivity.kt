package com.example.musicrelaxingapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.view.animation.AlphaAnimation
import android.view.animation.AnimationSet
import android.view.animation.DecelerateInterpolator
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.airbnb.lottie.LottieDrawable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaPlayer = MediaPlayer.create(this, R.raw.clarion)
        mediaPlayer.start()
        mediaPlayer.isLooping = true

        spinnerTime()
    }

    fun spinnerTime(){
        // access the items of the list
        val languages = resources.getStringArray(R.array.menit)

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                    if(position == 0){
                        mediaPlayer.pause()
                        imgbreathe.visibility = View.GONE
                        txtKata1.visibility = View.GONE
                        txtKata2.visibility = View.GONE
                        txtKata3.visibility = View.GONE
                        txtKata4.visibility = View.GONE
                        txtKata5.visibility = View.GONE
                        txtKata6.visibility = View.GONE
                        txtKata7.visibility = View.GONE
                        txtKata8.visibility = View.GONE
                        txtKata9.visibility = View.GONE
                        txtKata10.visibility = View.GONE
                        txtKata11.visibility = View.GONE
                        motivasi1.visibility = View.GONE
                        motivasi2.visibility = View.GONE
                        motivasi3.visibility = View.GONE
                        motivasi4.visibility = View.GONE
                        motivasi5.visibility = View.GONE
                    }else if(position == 1){
                        mediaPlayer.start()
                        imgbreathe.visibility = View.VISIBLE
                        imgbreathe.playAnimation()
                        imgbreathe.loop(true)
                        imgbreathe.repeatCount = LottieDrawable.INFINITE

                        val fadeIn = AlphaAnimation(0f, 1f)
                        fadeIn.interpolator = DecelerateInterpolator() //add this
                        fadeIn.startOffset = 1500
                        fadeIn.duration = 3000

                        val fadeOut = AlphaAnimation(1f, 0f)
                        fadeOut.interpolator = AccelerateInterpolator() //and this
                        fadeOut.startOffset = 1000
                        fadeOut.duration = 5000

                        val animation = AnimationSet(false) //change to false
                        animation.addAnimation(fadeIn)
                        animation.addAnimation(fadeOut)
                        txtKata1.setAnimation(animation)

                        val fadeIn2 = AlphaAnimation(0f, 1f)
                        fadeIn2.interpolator = DecelerateInterpolator() //add this
                        fadeIn2.startOffset = 6500
                        fadeIn2.duration = 3000

                        val fadeOut2 = AlphaAnimation(1f, 0f)
                        fadeOut2.interpolator = AccelerateInterpolator() //and this
                        fadeOut2.startOffset = 8000
                        fadeOut2.duration = 5000

                        val animation2 = AnimationSet(false) //change to false
                        animation2.addAnimation(fadeIn2)
                        animation2.addAnimation(fadeOut2)
                        txtKata2.setAnimation(animation2)

                        val fadeIn3 = AlphaAnimation(0f, 1f)
                        fadeIn3.interpolator = DecelerateInterpolator() //add this
                        fadeIn3.startOffset = 13000
                        fadeIn3.duration = 3000

                        val fadeOut3 = AlphaAnimation(1f, 0f)
                        fadeOut3.interpolator = AccelerateInterpolator() //and this
                        fadeOut3.startOffset = 15000
                        fadeOut3.duration = 5000

                        val animation3 = AnimationSet(false) //change to false
                        animation3.addAnimation(fadeIn3)
                        animation3.addAnimation(fadeOut3)
                        txtKata3.setAnimation(animation3)

                        val fadeIn4 = AlphaAnimation(0f, 1f)
                        fadeIn4.interpolator = DecelerateInterpolator() //add this
                        fadeIn4.startOffset = 20000
                        fadeIn4.duration = 7000

                        val fadeOut4 = AlphaAnimation(1f, 0f)
                        fadeOut4.interpolator = AccelerateInterpolator() //and this
                        fadeOut4.startOffset = 27000
                        fadeOut4.duration = 5000

                        val animation4 = AnimationSet(false) //change to false
                        animation4.addAnimation(fadeIn4)
                        animation4.addAnimation(fadeOut4)
                        txtKata4.setAnimation(animation4)

                        val fadeIn5 = AlphaAnimation(0f, 1f)
                        fadeIn5.interpolator = DecelerateInterpolator() //add this
                        fadeIn5.startOffset = 34000
                        fadeIn5.duration = 7000

                        val fadeOut5 = AlphaAnimation(1f, 0f)
                        fadeOut5.interpolator = AccelerateInterpolator() //and this
                        fadeOut5.startOffset = 41000
                        fadeOut5.duration = 5000

                        val animation5 = AnimationSet(false) //change to false
                        animation5.addAnimation(fadeIn5)
                        animation5.addAnimation(fadeOut5)
                        txtKata5.setAnimation(animation5)

                        val fadeIn6 = AlphaAnimation(0f, 1f)
                        fadeIn6.interpolator = DecelerateInterpolator() //add this
                        fadeIn6.startOffset = 48000
                        fadeIn6.duration = 3000

                        val fadeOut6 = AlphaAnimation(1f, 0f)
                        fadeOut6.interpolator = AccelerateInterpolator() //and this
                        fadeOut6.startOffset = 55000
                        fadeOut6.duration = 5000

                        val animation6 = AnimationSet(false) //change to false
                        animation6.addAnimation(fadeIn6)
                        animation6.addAnimation(fadeOut6)
                        txtKata6.setAnimation(animation6)

                        val fadeIn7 = AlphaAnimation(0f, 1f)
                        fadeIn7.interpolator = DecelerateInterpolator() //add this
                        fadeIn7.startOffset = 60000
                        fadeIn7.duration = 3000

                        val fadeOut7 = AlphaAnimation(1f, 0f)
                        fadeOut7.interpolator = AccelerateInterpolator() //and this
                        fadeOut7.startOffset = 65000
                        fadeOut7.duration = 5000

                        val animation7 = AnimationSet(false) //change to false
                        animation7.addAnimation(fadeIn7)
                        animation7.addAnimation(fadeOut7)
                        txtKata7.setAnimation(animation7)

                        val fadeIn8 = AlphaAnimation(0f, 1f)
                        fadeIn8.interpolator = DecelerateInterpolator() //add this
                        fadeIn8.startOffset = 70000
                        fadeIn8.duration = 7000

                        val fadeOut8 = AlphaAnimation(1f, 0f)
                        fadeOut8.interpolator = AccelerateInterpolator() //and this
                        fadeOut8.startOffset = 77000
                        fadeOut8.duration = 5000

                        val animation8 = AnimationSet(false) //change to false
                        animation8.addAnimation(fadeIn8)
                        animation8.addAnimation(fadeOut8)
                        txtKata8.setAnimation(animation8)

                        val fadeIn9 = AlphaAnimation(0f, 1f)
                        fadeIn9.interpolator = DecelerateInterpolator() //add this
                        fadeIn9.startOffset = 82000
                        fadeIn9.duration = 7000

                        val fadeOut9 = AlphaAnimation(1f, 0f)
                        fadeOut9.interpolator = AccelerateInterpolator() //and this
                        fadeOut9.startOffset = 89000
                        fadeOut9.duration = 5000

                        val animation9 = AnimationSet(false) //change to false
                        animation9.addAnimation(fadeIn9)
                        animation9.addAnimation(fadeOut9)
                        txtKata9.setAnimation(animation9)

                        val fadeIn10 = AlphaAnimation(0f, 1f)
                        fadeIn10.interpolator = DecelerateInterpolator() //add this
                        fadeIn10.startOffset = 94000
                        fadeIn10.duration = 7000

                        val fadeOut10 = AlphaAnimation(1f, 0f)
                        fadeOut10.interpolator = AccelerateInterpolator() //and this
                        fadeOut10.startOffset = 101000
                        fadeOut10.duration = 7000

                        val animation10 = AnimationSet(false) //change to false
                        animation10.addAnimation(fadeIn10)
                        animation10.addAnimation(fadeOut10)
                        txtKata10.setAnimation(animation10)

                        val fadeIn11 = AlphaAnimation(0f, 1f)
                        fadeIn11.interpolator = DecelerateInterpolator() //add this
                        fadeIn11.startOffset = 108000
                        fadeIn11.duration = 7000

                        val fadeOut11 = AlphaAnimation(1f, 0f)
                        fadeOut11.interpolator = AccelerateInterpolator() //and this
                        fadeOut11.startOffset = 120000
                        fadeOut11.duration = 7000

                        val animation11 = AnimationSet(false) //change to false
                        animation11.addAnimation(fadeIn11)
                        animation11.addAnimation(fadeOut11)
                        txtKata11.setAnimation(animation11)

                        val fadeIn13 = AlphaAnimation(0f, 1f)
                        fadeIn13.interpolator = DecelerateInterpolator() //add this
                        fadeIn13.startOffset = 140000
                        fadeIn13.duration = 10000

                        val fadeOut13 = AlphaAnimation(1f, 0f)
                        fadeOut13.interpolator = AccelerateInterpolator() //and this
                        fadeOut13.startOffset = 150000
                        fadeOut13.duration = 7000

                        val animation13 = AnimationSet(false) //change to false
                        animation13.addAnimation(fadeIn13)
                        animation13.addAnimation(fadeOut13)
                        motivasi1.setAnimation(animation13)

                        val fadeIn14 = AlphaAnimation(0f, 1f)
                        fadeIn14.interpolator = DecelerateInterpolator() //add this
                        fadeIn14.startOffset = 158000
                        fadeIn14.duration = 10000

                        val fadeOut14 = AlphaAnimation(1f, 0f)
                        fadeOut14.interpolator = AccelerateInterpolator() //and this
                        fadeOut14.startOffset = 168000
                        fadeOut14.duration = 7000

                        val animation14 = AnimationSet(false) //change to false
                        animation14.addAnimation(fadeIn14)
                        animation14.addAnimation(fadeOut14)
                        motivasi2.setAnimation(animation14)

                        val fadeIn15 = AlphaAnimation(0f, 1f)
                        fadeIn15.interpolator = DecelerateInterpolator() //add this
                        fadeIn15.startOffset = 174000
                        fadeIn15.duration = 10000

                        val fadeOut15 = AlphaAnimation(1f, 0f)
                        fadeOut15.interpolator = AccelerateInterpolator() //and this
                        fadeOut15.startOffset = 184000
                        fadeOut15.duration = 7000

                        val animation15 = AnimationSet(false) //change to false
                        animation15.addAnimation(fadeIn15)
                        animation15.addAnimation(fadeOut15)
                        motivasi5.setAnimation(animation15)

                    }


                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        mediaPlayer.start()
    }

    override fun onPause() {
        super.onPause()
        mediaPlayer.pause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
        mediaPlayer.release()
    }
}