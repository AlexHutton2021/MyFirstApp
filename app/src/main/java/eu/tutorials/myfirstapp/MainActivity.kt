package eu.tutorials.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val tvMyTextView = findViewById<TextView>(R.id.textView)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
           timesClicked = timesClicked + 1

            tvMyTextView.text = timesClicked.toString()
            Toast.makeText(this, "No of counts", Toast.LENGTH_LONG).show()


        }

    }
}
//main activity code which is the class (view) where everything happens
//
//Activitymain.xml is the layout
//
//edited the xml file by dragging in a button changing the text view
//
//gave id’s a unique name that could be accessed later
//
//in the main activity we used the id’s findviewbyid method (searching for a button that has a certain id and want to assign that to btnclickme
//
//method setonclicklistener that we can execute
//
//timesclicked=0 and everytime its clicked it will incrementally increase