package com.example.p1431658.listviewwithparse;

    import android.app.Activity;
    import android.app.Fragment;
    import android.net.Uri;
    import android.os.Bundle;
    import android.support.v4.app.ListFragment;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;


    /**
     * A simple {@link Fragment} subclass.
     * Activities that contain this fragment must implement the
     * {@link BlankFragment.OnFragmentInteractionListener} interface
     * to handle interaction events.
     * Use the {@link BlankFragment#newInstance} factory method to
     * create an instance of this fragment.
     */

    public class BlankFragment extends ListFragment {
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragment_blank,container,false);
        return rootView;
    }
    }