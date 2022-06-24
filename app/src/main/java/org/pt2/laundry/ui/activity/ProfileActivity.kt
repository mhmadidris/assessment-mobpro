package org.pt2.laundry.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import org.pt2.laundry.MainViewModel
import org.pt2.laundry.R
import org.pt2.laundry.databinding.ActivityProfileBinding
import org.pt2.laundry.model.Profile
import org.pt2.laundry.network.ProfileApi

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val media = "https://github.com/indraazimi/galeri-hewan/blob/master/screenshots/main.png"
        Glide.with(this)
            .load(media)
            .error(R.drawable.ic_baseline_broken_image_24)
            .into(binding.imageView)
        println("coba")

        val actionbar = supportActionBar
        actionbar!!.title = "Profile"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}