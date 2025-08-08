package np.com.bimalkafle.loginapp

import android.widget.Button
import android.widget.EditText
import ...

private val MainActivity.loginBtn: Any
d
class MainActivity : AppCompatActivity() {
    lateinit var usernameInput : EditText
    lateinit var passwordInput : EditText
    lateinit var loinBtn : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        usernameInput = findViewById(R.id.username_input)
        passwordInput = findViewById(R.id.password_input)
        loinBtn = findViewById(R.id.login_btn)

        loginBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
            Log.i("Test Credentials ", "Username: $username, Password: $password")

        }


        }
    }

private fun Any.setOnClickListener(function: Any) {}
