package br.com.jpegsinng.ciclodevida

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.jpegsinng.ciclodevida.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editAnimal = binding.editAnimal
        val editBreed = binding.editBreed
        val buttonSend = binding.buttonSend

        buttonSend.setOnClickListener {
            val animal = editAnimal.text.toString()
            val breed = editBreed.text.toString()
            val intent = Intent(this, ResultActivity::class.java)
            if (editAnimal.text.isEmpty() || editBreed.text.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            } else {
                intent.putExtra("animal", animal)
                intent.putExtra("breed", breed)
                startActivity(intent)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("CDV", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CDV", "onResume")
    }
}