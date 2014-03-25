package pro.vylgin.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockFragment;

public class FragmentTabColor extends SherlockFragment {

    private int color;

    public FragmentTabColor(int color) {
        this.color = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second_color, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setBackgroundColor(color);

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        setUserVisibleHint(true);
    }

}
