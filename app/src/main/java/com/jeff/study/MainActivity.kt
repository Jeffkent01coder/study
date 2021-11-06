package com.jeff.study

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.provider.MediaStore
import androidx.core.content.FileProvider
import com.jeff.study.databinding.ActivityMainBinding
import java.io.File

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnShare.setOnClickListener {
            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "This is my text to send.")
                type = "text/plain"
            }

            val shareIntent = Intent.createChooser(sendIntent, null)
            startActivity(shareIntent)
        }

        binding.btnNext.setOnClickListener {
            startActivity(Intent(this, Recycler::class.java))
        }

//        binding.btnTakePhoto.setOnClickListener {
//            val takePhotoIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
//            filePhoto = getPhotoFile(FILE_NAME)
//            val providerFile =
//                FileProvider.getUriForFile(this,"com.example.androidcamera.fileprovider", filePhoto)
//            takePhotoIntent.putExtra(MediaStore.EXTRA_OUTPUT, providerFile)
//        }

    }
}
//private fun getPhotoFile(fileName: String): File {
//    val directoryStorage = getExternalFilesDir(Environment.DIRECTORY_PICTURES)
//    return File.createTempFile(fileName, ".jpg", directoryStorage)
//}