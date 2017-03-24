package azuredrop.criminalintent;

import android.support.v4.app.Fragment;

public class CrimeActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFrament() {
        return new CrimeFragment();
    }
}
