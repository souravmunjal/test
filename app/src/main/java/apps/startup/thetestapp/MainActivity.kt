package apps.startup.thetestapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickButton=findViewById<Button>(R.id.button);
        clickButton.setOnClickListener {
            showTheDialog();
        }
    }

    private fun showTheDialog() {
        val firstScreenDialog=FirstScreenDialog.newInstance();
        firstScreenDialog.show(supportFragmentManager,"hi");
    }
}
