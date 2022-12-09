package com.example.onbordingscreen

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class OnboardingItemsAdapter(private val onboardingitem: List<OnBoardingItem>) :
    RecyclerView.Adapter<OnboardingItemsAdapter.OnBoardingItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnBoardingItemViewHolder {
        return OnBoardingItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.onboarding_item_container,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: OnBoardingItemViewHolder, position: Int) {
       holder.bind(onboardingitem[position])
    }

    override fun getItemCount(): Int {
        return onboardingitem.size
    }

    inner class OnBoardingItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val imageOnboarding = view.findViewById<ImageView>(R.id.imageOnBoarding)
        private val textTitle = view.findViewById<TextView>(R.id.textTitle)
        private val textDescription = view.findViewById<TextView>(R.id.textDescription)

        fun bind(onboardingitem: OnBoardingItem) {
            imageOnboarding.setImageResource(onboardingitem.onBoardingImage)
            textTitle.text = onboardingitem.title
            textDescription.text = onboardingitem.description
        }
    }
}