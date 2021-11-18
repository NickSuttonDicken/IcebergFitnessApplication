package com.froztisoftware.icebergfitness.fragments

import android.os.Bundle
import android.os.Handler
import android.transition.AutoTransition
import android.transition.Transition
import android.transition.TransitionManager
import android.view.*
import android.widget.CheckBox
import android.widget.RelativeLayout
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.froztisoftware.icebergfitness.R
import com.google.android.material.appbar.MaterialToolbar
import kotlinx.coroutines.delay
import net.cachapa.expandablelayout.ExpandableLayout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_profile, container, false)

        val checkBox: CheckBox = v.findViewById(R.id.toggleCheckBox)

        checkBox.setOnClickListener {
            toggleDetails(v)
        }



        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ProfileFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ProfileFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    private fun toggleDetails(v: View) {
        val cardView: CardView = v.findViewById(R.id.card)
        val hidden: RelativeLayout = v.findViewById(R.id.expanding)
        val expandable: ExpandableLayout = v.findViewById(R.id.expandable)

        expandable.toggle()


        /*if (hidden.visibility == View.VISIBLE)
        {

            TransitionManager.beginDelayedTransition(hidden, AutoTransition())
            hidden.visibility = View.INVISIBLE
            hidden.visibility = View.GONE
        }
        else {
            TransitionManager.beginDelayedTransition(cardView, AutoTransition())
            hidden.visibility = View.VISIBLE
        }*/

    }
}