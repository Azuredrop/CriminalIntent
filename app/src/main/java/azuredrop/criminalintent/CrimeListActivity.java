package azuredrop.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Administrator on 2017/3/24.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFrament() {
        return new CrimeListFragment();
    }
}
