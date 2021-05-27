package sg.edu.rp.id18044455.demoswiper;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Frag1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View frag1 = inflater.inflate(R.layout.fragment_frag1, container, false);

        return frag1;

    }//end of onCreateView

}//end of class