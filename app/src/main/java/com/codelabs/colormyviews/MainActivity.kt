package com.codelabs.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListeners()
    }

    ///////////////////
    // helper method //
    ///////////////////

    private fun makeColored(view: View) {
        when (view.id) {

            // set color to each button depend of its id
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.box_one_image)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.box_two_image)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.box_three_image)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.box_four_image)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.box_five_image)
            R.id.red_button -> view.setBackgroundResource(R.color.my_red)
            R.id.green_button -> view.setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> view.setBackgroundResource(R.color.my_yellow)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(box_one_text, box_two_text, box_three_text,
            box_four_text, box_five_text, constraint_layout, red_button, green_button, yellow_button)

        clickableViews.forEach { item -> item.setOnClickListener { makeColored(it) } }
    }
}
