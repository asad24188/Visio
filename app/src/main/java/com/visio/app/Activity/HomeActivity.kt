package com.visio.app.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.visio.app.Adapter.AddProjAdapter
import com.visio.app.DataModel.ProjectModel
import com.visio.app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    private lateinit var adapter: AddProjAdapter
    private lateinit var list: ArrayList<ProjectModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddproj.setOnClickListener { startActivity(Intent(this,CameraActivity::class.java)) }

        list = ArrayList()
        list.add(
            ProjectModel(
                "Projects 1",
                "Boston, Ma", "10 Feb 2022"
            )
        )
        list.add(
            ProjectModel(
                "Projects 2",
                "New York, Ny", "10 Feb 2022"
            )
        )

        binding.projectRecycler.layoutManager = LinearLayoutManager(this)
        adapter = AddProjAdapter(this,list)
        binding.projectRecycler.adapter = adapter

    }
}