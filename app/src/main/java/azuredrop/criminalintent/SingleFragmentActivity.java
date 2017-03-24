package azuredrop.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by Administrator on 2017/3/24.
 */

public abstract class SingleFragmentActivity extends FragmentActivity {
    protected abstract Fragment createFrament();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if(fragment==null){
            fragment = createFrament();
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }
}
