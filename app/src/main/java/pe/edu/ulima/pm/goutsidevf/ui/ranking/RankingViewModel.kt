package pe.edu.ulima.pm.goutsidevf.ui.ranking

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RankingViewModel: ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "This is ranking Fragment"
    }
    val text: LiveData<String> = _text
}
