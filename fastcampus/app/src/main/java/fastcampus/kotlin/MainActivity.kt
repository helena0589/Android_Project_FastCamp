package fastcampus.kotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SAM : Single Abstract Method
        val view = View(this)
        /*java
           view.setOnCliClickListener(
            new View.OnClickListener(){
                @Override
                 public void onClick(View: View){
                    //
                 }
             }
           )
        * */
        view.setOnClickListener ({ println("안녕") })
        view.setOnClickListener {println("안녕")}
    }
}