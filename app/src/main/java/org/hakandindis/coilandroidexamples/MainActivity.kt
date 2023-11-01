package org.hakandindis.coilandroidexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.hakandindis.coilandroidexamples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val url = "https://lh3.googleusercontent.com/4-Xg-ZCslsgDGho65sNJLCt-cYheBmNv0ZWJynYA1zo_RqjuyfnvZIgJ0wPGeXvAJ5wgq-mG5UzKf4GGYTjA9ZvTk1gDwcsOZ1TRNZngGqPKqKByFcE=w1400-rwa-e366-v1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.lifecycleOwner = this
        binding.url = url
        //binding.originalImageView.load(url)
        //binding.modifiedImageView.loadBlurredImage(url)
    }
}