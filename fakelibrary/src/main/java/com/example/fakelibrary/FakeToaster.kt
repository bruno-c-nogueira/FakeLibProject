package com.example.fakelibrary

import android.content.Context
import android.widget.Toast

object FakeToaster {
   fun showJoke(context: Context){
       Toast.makeText(context, "HTML is programming language",Toast.LENGTH_SHORT).show();

   }
}