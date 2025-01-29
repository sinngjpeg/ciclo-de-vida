package br.com.jpegsinng.ciclodevida

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.jpegsinng.ciclodevida.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animal = intent.getStringExtra("animal")
        val breed = intent.getStringExtra("breed")
        binding.textMessage.text =
            getString(R.string.result_screen, animal, breed)
    }
}