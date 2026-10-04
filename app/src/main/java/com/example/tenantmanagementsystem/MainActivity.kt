package com.example.tenantmanagementsystem
import com.example.tenantmanagementsystem.databinding.ActivityMainBinding
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.saveButton.setOnClickListener {

            val name = binding.tenantNameEditText.text.toString()
            val phone = binding.phoneEditText.text.toString()
            val rent = binding.rentEditText.text.toString()

            val tenant = Tenant(name, phone, rent)
            binding.tenant = tenant
        }


       // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
         //   val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
           // v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            //insets
        //}
    }
}