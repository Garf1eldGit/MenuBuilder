package pet.project.menubuilder.fragment

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pet.project.menubuilder.R

class FragmentGoogleAuth: Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = inflater?.inflate(R.layout.fragment_google_auth ,null)

}