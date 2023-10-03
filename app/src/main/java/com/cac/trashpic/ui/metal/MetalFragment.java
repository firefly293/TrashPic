package com.cac.trashpic.ui.metal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.cac.trashpic.databinding.FragmentCardboardBinding;

public class MetalFragment extends Fragment {

    private FragmentCardboardBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MetalViewModel cardboardViewModel =
                new ViewModelProvider(this).get(MetalViewModel.class);

        binding = FragmentCardboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCardboard;
        cardboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}