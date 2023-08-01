package com.naama.loginem2em.ui.lib;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.naama.loginem2em.databinding.FragmentLibBinding;

public class LibFragment extends Fragment {

    private FragmentLibBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        LibViewModel notificationsViewModel =
                new ViewModelProvider(this).get(LibViewModel.class);

        binding = FragmentLibBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textLib;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}