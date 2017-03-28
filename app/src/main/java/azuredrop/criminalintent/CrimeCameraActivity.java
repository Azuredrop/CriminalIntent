package azuredrop.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by AzureDrop on 2017/3/28.
 */

public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFrament() {
        return new CrimeCameraFragment();
    }
}
