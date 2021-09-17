package co.za.appbrewery.notify.ui.activities.community

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import co.za.appbrewery.notify.R
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class ComListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_com_list)

        //actionbar
        val actionbar = supportActionBar

        //set actionbar title
        "My Alerts".also { actionbar!!.title = it }

        //set back button
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)

        //hooks
        val btnAdd = findViewById<ExtendedFloatingActionButton>(R.id.bntAddCommunity)
        val btnView = findViewById<CardView>(R.id.cardView)


        btnAdd.setOnClickListener {
            val intent = Intent(this, ComCreateActivity::class.java)
            startActivity(intent)
        }

        btnView.setOnClickListener {
            val intent = Intent(this, ComDetailsActivity::class.java)
            startActivity(intent)
        }


    }

    //back button function
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}