package com.project134.giftideas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import com.project134.giftideas.MainActivity



class DialogFragment : DialogFragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var rootView: View = inflater.inflate(R.layout.dialog_fragment, container, false)

        var add_button : Button = rootView.findViewById(R.id.add_button)
        var cancel_button : Button = rootView.findViewById(R.id.cancel)

        add_button.setOnClickListener{
            var edit_box : EditText = rootView.findViewById(R.id.edit_name)
            var result = edit_box.text.toString()
            var mainActivity = MainActivity()
            mainActivity.addToList(result)
            dismiss()
        }

        cancel_button.setOnClickListener {
            dismiss()
        }
        return rootView
    }

}