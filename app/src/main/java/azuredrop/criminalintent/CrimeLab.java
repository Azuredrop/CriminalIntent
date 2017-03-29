package azuredrop.criminalintent;

import android.content.Context;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by Administrator on 2017/3/24.
 */

public class CrimeLab {
    private static final String TAG = "CrimeLab";
    private static final String FILENAME = "Crimes.json";

    private static CrimeLab sCrimeLab;
    private Context mAppContext;

    private ArrayList<Crime> mCrimes;
    private CriminalIntentJSONSerializer mSerializer;

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public void deleteCrime(Crime c) {
        mCrimes.remove(c);
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    private CrimeLab(Context appContext) {
        mAppContext = appContext;
        mSerializer = new CriminalIntentJSONSerializer(mAppContext, FILENAME);

        try {
            mCrimes = mSerializer.loadCrimes();
        } catch (Exception e) {
            mCrimes = new ArrayList<Crime>();
            Toast.makeText(appContext, "CrimeLab failed: " + e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }

    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }

        return sCrimeLab;
    }

    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes) {
            if (c.getId().equals(id))
                return c;
        }

        return null;
    }

    public boolean saveCrimes() {
        try {
            mSerializer.saveCrimes(mCrimes);
            return true;
        } catch (Exception e) {
            Toast.makeText(mAppContext, "saveCrimes error: " + e.getMessage(), Toast.LENGTH_LONG).show();
            return false;
        }
    }
}
