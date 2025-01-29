package br.com.jpegsinng.ciclodevida

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
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

    override fun onStart() {
        super.onStart()
        Log.i("CDV", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CVD", "onResume")
    }
}