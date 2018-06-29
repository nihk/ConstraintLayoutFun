package ca.nick.constraintlayoutfun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.groups.*

class MainActivity : AppCompatActivity() {

    /**
     * TODO:
     * Constraints
     * Biases
     * Chains
     * Guidelines
     * Barriers
     * Groups
     * Circles
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.groups)

        toggle.setOnClickListener {
            group.visibility = if (group.visibility == View.VISIBLE) {
                View.GONE
            } else {
                View.VISIBLE
            }
        }
    }
}
