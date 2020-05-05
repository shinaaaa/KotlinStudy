package com.shindorim.weatherforecast

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.Constraints

class settingFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        childFragmentManager.beginTransaction().replace(R.id.container, settingList()).commit()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnMypage = view.findViewById<Constraints>(R.id.setting_mypage_Layout)
        val btnPrivacy = view.findViewById<Constraints>(R.id.setting_privacy_Layout)

        btnMypage.setOnClickListener { view ->
            Log.d("TAG", "마이페이지")
        }

        btnPrivacy.setOnClickListener { view ->
            Log.d("TAG", "개인정보 관리")
        }

    }
}
