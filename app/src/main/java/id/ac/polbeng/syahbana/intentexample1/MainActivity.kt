package id.ac.polbeng.syahbana.intentexample1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

    val Log = Logger.getLogger(MainActivity::class.java.name)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.info("onCreate")
        btnToSecondActivity.setOnClickListener{
            val m_intent = Intent(this@MainActivity,SecondActivity::class.java)
            startActivity(m_intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.info("onStart")
    }

    override fun onStop() {
        super.onStop()
        Log.info("onStop")
    }
}