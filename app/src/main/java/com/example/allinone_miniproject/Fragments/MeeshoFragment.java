package com.example.allinone_miniproject.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.allinone_miniproject.R;
import com.example.allinone_miniproject.WebViewController;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MeeshoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MeeshoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MeeshoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MeeshoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MeeshoFragment newInstance(String param1, String param2) {
        MeeshoFragment fragment = new MeeshoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmentreturn inflater.inflate(R.layout.fragment_meesho, container, false);
        View view = inflater.inflate(R.layout.fragment_meesho, container, false);
        WebView webView = view.findViewById(R.id.webView_meesho);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());


        webView.loadUrl("https://meesho.com/");
        webView.setWebViewClient(new WebViewController());


        return view;
    }
}