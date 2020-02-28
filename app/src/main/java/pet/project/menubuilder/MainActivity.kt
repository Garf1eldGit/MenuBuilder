package pet.project.menubuilder

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.common.SignInButton

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signInButton: SignInButton = findViewById(R.id.signInButton)

        signInButton.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {

    }

}

