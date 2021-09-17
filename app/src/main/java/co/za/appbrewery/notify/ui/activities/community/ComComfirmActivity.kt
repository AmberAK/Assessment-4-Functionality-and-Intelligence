package co.za.appbrewery.notify.ui.activities.community

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import co.za.appbrewery.notify.R
import com.google.android.material.button.MaterialButton

class ComComfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_com_comfirm)


        //actionbar
        val actionbar = supportActionBar

        //set actionbar title
        "Confirmation".also { actionbar!!.title = it }

        //set back button
        actionbar?.setDisplayHomeAsUpEnabled(true)
        actionbar?.setDisplayHomeAsUpEnabled(true)

        //hooks
        val btnDone = findViewById<MaterialButton>(R.id.btnDone)

        btnDone.setOnClickListener {
            val intent = Intent(this, ComListActivity::class.java)
            startActivity(intent)
        }
    }

    //back button function
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}