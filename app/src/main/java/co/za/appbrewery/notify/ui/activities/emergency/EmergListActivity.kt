package co.za.appbrewery.notify.ui.activities.emergency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.za.appbrewery.notify.R

class EmergListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emerg_list)

        //actionbar
        val actionbar = supportActionBar

        //set actionbar title
        "Emergency Alerts".also { actionbar!!.title = it }

        //set back button
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)
    }

    //back button function
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}